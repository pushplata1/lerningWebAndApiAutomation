package org.example.praveen_practice;

import java.util.ArrayList;
import java.util.List;

public class Vowel_Filter {
    public static void main(String[] args) {
        String s="Praveen";
        List <Character> k=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char chr =s.charAt(i);
            if (chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'){
                k.add(chr);

            }

        }
        System.out.println(k);
    }
}
