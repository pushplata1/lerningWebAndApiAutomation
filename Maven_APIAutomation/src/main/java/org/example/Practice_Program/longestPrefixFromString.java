package org.example.Practice_Program;

import java.util.Arrays;

public class longestPrefixFromString {

    public  static  StringBuilder commomPrefixLogic(String[] arr){
        StringBuilder sb = new StringBuilder();
          Arrays.sort(arr);
            int size= arr.length;

            if(size==0 ){
                System.out.println("");
            }
            else if (size==1){
                System.out.println("longest prefix is "+arr[0]);
            }

            for(int i =0; i<arr[0].length();i++){
                if(arr[0].charAt(i)==arr[size-1].charAt(i)){
                    sb.append(arr[0].charAt(i));
                }
            }
        return sb;
    }

    public static void main(String[] args) {
        String arr[]={"pushpa","push","pushpi","pushp" };

        StringBuilder str=commomPrefixLogic(arr);
        System.out.println(str);
    }
}
