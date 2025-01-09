package org.example.JavaParactice;

public class ImplementationClass implements practiceInterface{
    @Override
    public void mi() {
        System.out.println("give the implementation");
    }

//    @Override
//    public void defaultMethod() {
//        System.out.println("Implemetaion default");
//    }

    public static void main(String[] args) {
        practiceInterface p = new ImplementationClass();
        p.defaultMethod();
        p.mi();
    }
}

