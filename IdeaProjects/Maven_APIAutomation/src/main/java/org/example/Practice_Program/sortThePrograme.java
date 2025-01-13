package org.example.Practice_Program;

import io.cucumber.java.sl.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortThePrograme {
    public static Integer[] sortStringLogic(int[] a, int[] b) {

        List<Integer> al = new ArrayList<>();
        for (int a1 : a) {
            al.add(a1);
        }
        for (int b1 : b) {
            al.add(b1);
        }
        Integer[] arra=new Integer[al.size()];

      Integer[] array=al.toArray(arra); //  Sort Form ----->   (Integer[] arr1=al.toArray(new Integer[al.size()]);
        Arrays.sort(array);



        return array;
    }

    public static Integer largestInteger(int[] num){

        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max)
                max = num[i];
        }
        return max;
    }

    public static Integer smallestInteger(int[] num){

        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min)
                min = num[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {90,78,54,0, 3, 4, 31};
        int[] b = {4, 6, 30};
        Integer[] a1 = sortThePrograme.sortStringLogic(a, b);


        for(int a5:a1){
            System.out.print(a5+" ");
        }


//        sortThePrograme.largestInteger(a);
//
//        Integer maxNumber = sortThePrograme.largestInteger(a);
//        System.out.println(maxNumber);
//
//        Integer minNumber = sortThePrograme.smallestInteger(a);
//        System.out.println(minNumber);
    }


}
