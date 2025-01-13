package org.example.JavaParactice;

public class duplicatCharatcerConsqutive {

    public static void main(String[] args) {
        String word= "abbeddefgh";

        StringBuilder sb = new StringBuilder();

        for(int i =0;i<word.length();i++){

            if(i==0||word.charAt(i)!=word.charAt(i-1)){
                sb.append(word.charAt(i));

            }
        }

        System.out.println(sb);
    }
}
