package org.example.TimeComplexityPOrograme;

import java.io.IOException;

public class jar {
    public static void main(String[] args) {
        try{
            int i =2/1;
            String s = null;
            System.out.println(s.length());

        }
        catch (ArithmeticException ie){
            System.out.println("two");
        }catch (NullPointerException n){
            System.out.println("Null pin");
        }
        catch (Exception u){
            System.out.println("one");
        }
        finally {
            System.out.println("finally");
        }

    }
}
