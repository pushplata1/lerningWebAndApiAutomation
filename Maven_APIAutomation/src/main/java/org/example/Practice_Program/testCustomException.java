package org.example.Practice_Program;

public class testCustomException {

    static void validate (int age) throws customException {
        if(age < 18){

            // throw an object of user defined exception
           throw new customException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args)  {


        try{
            validate(13);
        }catch (customException ex){

            System.out.println(ex.getMessage());


        }
    }

    public static class leftAndRightRotateCharaterPractice {


        public static String rightRotateCalculation(String word,int d){
            String right=leftRotateCalculation(word,d);
            return right;
        }
        public static String leftRotateCalculation(String word,int d){

            String left=word.substring(d)+word.substring(0,d);
            return left;
        }

        public static void main(String[] args) {
            String word="PushplataKumari";

            String leftRotate=leftRotateCalculation(word,2);
            System.out.println(leftRotate);

            String rightRotate=rightRotateCalculation(word,word.length()-2);
            System.out.println(rightRotate);
        }
    }
}
