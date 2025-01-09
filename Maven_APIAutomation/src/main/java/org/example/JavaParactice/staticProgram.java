package org.example.JavaParactice;

public class staticProgram {

    //static variable
     public static int a;
           String b;

//static method
    public static int staticMethod(){
        System.out.println("This is add of two no"+a);
        int x=a;
        int y=9;
        System.out.println(y);
        return y;
    }

    //static Block
    static {
        System.out.println("sattic block");
    }


    public  int addNonStaticMethod(){
        System.out.println("This is add of two no"+a);
       int x=10;
        return x;
    }


    public static void main(String [] args){

        System.out.println("static program main method");
        System.out.println(a);
        staticMethod();

   ///  to access no static method we need to create object
        staticProgram sp= new staticProgram();
        System.out.println("------>"+sp.addNonStaticMethod());

      //  System.out.println(sp.x);
    }


}



