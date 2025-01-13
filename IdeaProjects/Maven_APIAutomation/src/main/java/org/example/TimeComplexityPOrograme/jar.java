package org.example.TimeComplexityPOrograme;

import java.io.IOException;

public class jar {
    public static void main(String[] args) {
        try{
            int i =1/0;

        }
        catch (ArithmeticException ie){
            System.out.println("two");
        }catch (Exception e){
            System.out.println("one");
        }

    }
}
