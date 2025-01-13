package org.example.praveen_practice;

import java.util.Arrays;

public class Array_Problem_1 {


    public int[] arrange(int [] arr){
        int x=0;

        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                x=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=x;
            }
        }
        return arr;


    }


    public static void main(String[] args){
       int [] arr={0,0,1,0,1,1,1,0};
        Array_Problem_1 obj=new Array_Problem_1();
      int [] a=obj.arrange(arr);
      String b=Arrays.toString(a);
       System.out.println(b);
    }
}
