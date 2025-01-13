package org.example.Practice_Program;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };



        int[] reverseArray = new int[arr.length];
        for(int i =0;i<= arr.length-1;i++){
            reverseArray[i]= arr[arr.length-i-1];
        }

        for (int i = 0; i < reverseArray.length; i++)
            System.out.println(reverseArray[i] + " ");
    }
    }

