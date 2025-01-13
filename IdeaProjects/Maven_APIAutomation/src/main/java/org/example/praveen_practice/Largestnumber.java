package org.example.praveen_practice;

public class Largestnumber {


        public static void main(String[] args){
            int[] a ={10,20,60,30,80,50,100,20};
            int largest=a[0];
            for (int i=1;i<=a.length-1;i++) {
                if(largest<a[i]){
                    largest=a[i];

                }

            }
            System.out.println("Largest element is: "+largest);


        }
    }

