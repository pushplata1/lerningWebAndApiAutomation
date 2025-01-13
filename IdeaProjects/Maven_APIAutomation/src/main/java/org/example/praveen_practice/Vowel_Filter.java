package org.example.praveen_practice;

import java.util.ArrayList;
import java.util.List;

public class Vowel_Filter {

    public void Vowel(String s){
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char chr =s.charAt(i);
            if (chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
               b.append(chr).append(" ");
            }

        } System.out.println("String of filtered vowel characters from string: "+b.toString().trim());

    }

    public void Vowel_List(String s){
        List <Character> k=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char chr =s.charAt(i);
            if (chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
                k.add(chr);
            }

        }
        System.out.println("List of filtered vowels characters from string "+k);
    }


    public static void main(String [] args) {
        String s="Praveen";
       Vowel_Filter v =new Vowel_Filter();
    v.Vowel_List(s);
    v.Vowel(s);


    }
}
