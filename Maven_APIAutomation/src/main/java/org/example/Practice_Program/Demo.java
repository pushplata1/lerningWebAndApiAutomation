package org.example.Practice_Program;

public class Demo {
    public static void main(String[] args) {

        for (Laptop lap:Laptop.values()){
            System.out.println(lap+"------->"+lap.getPrice());
        }
    }
}
