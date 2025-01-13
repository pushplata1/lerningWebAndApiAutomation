package org.example.TimeComplexityPOrograme;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class occurance1 {
    public static void main(String[] args) {
        String s="babA";
        Map<Character,Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        Map<Integer,Character> r= new TreeMap<>();

        for(Map.Entry<Character,Integer> m:map.entrySet()){

            r.put(m.getValue(), m.getKey());

        }

        Collections.reverseOrder();

        String s1="";
//        for(Map.Entry<Character,Integer> final:r.entrySet()){
//
//            s1=s1+final.getValue();
//
//        }

    }
}
