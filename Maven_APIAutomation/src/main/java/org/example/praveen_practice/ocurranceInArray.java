package org.example.praveen_practice;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ocurranceInArray {

    public static void main(String[] args) {
        int [] arr ={1,2,3,2,5,4,2,6};
        Map<Integer,Integer> m= new LinkedHashMap<>();
        for (int i=0 ;i<=arr.length-1;i++){
            if(m.containsKey(arr[i])){


            m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }


        }

        for(Map.Entry<Integer,Integer> a: m.entrySet()){
            System.out.println(a.getKey()+" no of occurance : "+a.getValue());

        }


    }
}
