package org.example.Practice_Program;

import java.util.Random;

public class GenerateRandomNum {
    public static void main(String[] args) {

        Random rum = new Random();

        //for the random NUm
        for(int i=0 ;i<5;i++){
            System.out.println(rum.nextInt(200));
        }

        //random String where lenght is provided

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;


        for(int i=0 ;i< length;i++){
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);

        }

        System.out.println(sb);

    }
}
