package org.example.Practice_Program;

import io.cucumber.java.sl.In;

import java.util.*;

public class HigestPricePrograme {

    public  static HashMap<String,Integer> sortByValue(HashMap<String,Integer> hm){
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        String[] product ={"iphone14","iphone11","Galaxy S24 Ultra","Pixel 7","iphone 10","Samsung S15"};
        int[] price ={799,600,700,899,700,580};

        HashMap<String,Integer> productDetail= new HashMap<>();
        for (int i =0;i<product.length;i++){
            if(product.length==price.length){
                productDetail.put(product[i],price[i]);
            }

        }
        Map<String, Integer> hm1 = sortByValue(productDetail);

        // print the sorted hashmap
//        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
//            System.out.println("Key = " + en.getKey() +
//                    ", Value = " + en.getValue());
//
//        }
        Set<String> keySet = hm1.keySet();
        String [] keyArray
                = keySet.toArray(new String[keySet.size()]);

        System.out.println("second higest phone is "+keyArray[hm1.size()-2] +"------>"+hm1.get(keyArray[hm1.size()-2]));

    }
}
