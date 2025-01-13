package org.example.praveen_practice;

import java.util.ArrayList;
import java.util.List;

public class Vowel_Filter {

    public List<Character> Vowel_List(String s){
        List <Character> k=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char chr =s.charAt(i);
            if (chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
                k.add(chr);
            }

        }
        return  k;
    }

    public String reverseStringLogic(String name){

        StringBuilder sb = new StringBuilder();
        for (int i =name.length;i>0;i--){

            sb.app
        }

        return

    }


    public static void main(String [] args) {
        String s="Praveen";
       Vowel_Filter v =new Vowel_Filter();
    System.out.println(v.Vowel_List(s));


    }
}
