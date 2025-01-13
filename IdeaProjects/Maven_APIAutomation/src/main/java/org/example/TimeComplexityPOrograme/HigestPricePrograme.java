package org.example.TimeComplexityPOrograme;

import java.util.*;

public class HigestPricePrograme {

    public static void calculation(Map<Integer,List<String>> hm ){
        int highestPrice= Integer.MIN_VALUE;
        int sceondHihestPrice= Integer.MIN_VALUE;

        for(int p:hm.keySet()){
            if(p>highestPrice){
                sceondHihestPrice=highestPrice;
                highestPrice=p;
            }
            else if(p>sceondHihestPrice &p<highestPrice){
                sceondHihestPrice=p;
            }
        }

        if(sceondHihestPrice!=Integer.MIN_VALUE){
            System.out.println(sceondHihestPrice+"-------->"+hm.get(sceondHihestPrice));
        }else{
            System.out.println("not enough prich is not to dertemine the secondHigestPrice ");
        }
    }


    public  static  void inBuiltcalculation(Map<Integer,List<String>> map){

        List<Integer> mapKey = new ArrayList<>(map.keySet());
        mapKey.sort(Collections.reverseOrder());

        if(mapKey.size()>=2){
            int secondHigestPrice =mapKey.get(1);
            System.out.println(secondHigestPrice+"----------->"+map.get(secondHigestPrice));
        }else {
            System.out.println("Not enough price entries to determine the second-highest price.");
        }
    }


    public static void main(String[] args) {
        String[] product ={"iphone14","iphone11","Galaxy S24 Ultra","Pixel 7","iphone 10","Samsung S15"};
        int[] price ={700,600,700,899,700,580};

        Map<Integer, List<String>> map = new HashMap<>();

        for(int i =0;i<product.length;i++){
            map.putIfAbsent(price[i],new ArrayList<>());
            map.get(price[i]).add(product[i]);
        }

        calculation(map);/// this approach will give you the Time complexity is O(k)

        System.out.println("---------------------------->");
        inBuiltcalculation(map);/// this approach will give you more Time complexity from above approach O(n+klogk)
    }
}
