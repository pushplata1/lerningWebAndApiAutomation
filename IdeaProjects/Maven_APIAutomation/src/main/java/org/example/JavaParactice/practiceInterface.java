package org.example.JavaParactice;

public interface practiceInterface {

    public  void  mi();

    default  int defaultMethod() {
        // Default method implementation
int i=0;
        System.out.println("Default method implementation");
        return i;
    }

    default  void m2(){

    }

}
