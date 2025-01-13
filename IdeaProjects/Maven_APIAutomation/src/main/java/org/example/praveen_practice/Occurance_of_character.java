package org.example.praveen_practice;

import org.example.Practice_Program.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance_of_character {

    public static void main(String[] args) {
        String name="Praveenn";
        String m=name.toLowerCase();
        Map<Character,Integer>  k=new LinkedHashMap<Character,Integer>();


        for (int i=0 ;i<m.length();i++){
            if(k.containsKey(m.charAt(i))){
                k.put(m.charAt(i), k.get(m.charAt(i))+1);

            }

            else{
                k.put(m.charAt(i),1);
            }

        }
for(Map.Entry<Character,Integer> j:k.entrySet()){

//    if (j.getValue()>1)
//    {
//        System.out.println(j.getKey());
//    }
   System.out.println(j.getKey()+" "+j.getValue());
}

    }
}
