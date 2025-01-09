package org.example.Practice_Program;

public class programe2 {

    public static int foo(int num){
        if(num==0) return 1;
        return num+foo(num-1);
    }

    public static void main(String[] args) {
       int x= foo(3);
        System.out.println(x);
    }
}
