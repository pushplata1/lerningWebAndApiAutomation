package org.example.TimeComplexityPOrograme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceOfCharacter {

    public  static  Map<Character,Integer> ocurranceCalculation(String str){
        str=str.toLowerCase();
        char[] charArray= str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<charArray.length;i++){
            if(map.containsKey(charArray[i])){
                map.put(charArray[i],map.get(charArray[i])+1);
            }
            else{
                map.put(charArray[i],1);
            }
        }
        return map;
    }

    public  static  Map<Character,Integer> OptimizedocurranceCalculation(String str){
        Map<Character,Integer> map = new HashMap<>();

        /// getOrDefault: Simplifies the logic for updating the count in the map, making the code concise and easier to understand.
        for(char c :str.toLowerCase().toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }



    public  static String reverseCharacterwithoutChangingPoistion(String statment){

        String[] str= statment.split(" ");
        StringBuilder result = new StringBuilder();
        // Reverse each word
        for (String word : str) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }



        return result.toString().trim();
    }

    public  static  String reverseWord(String str){
        StringBuilder sb = new StringBuilder(str);
        sb=sb.reverse();
        return sb.toString();
    }

    public static  String removeDuplicateCharter(String str){
        Set<Character> set= new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char[] ch= str.toCharArray();
        for(char ch1:ch){
            System.out.println("Before  : "+ch1);
            if(set.add(ch1)){
                System.out.println("after  : "+ch1);
                sb.append(ch1);
            }

        }

//        for(char c:set){
//
//            System.out.println(c);
//        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String name = "Pushplata";
        String word = "My name is PushpLata";

//        System.out.println("Find the occurance of character from string----------");
//        System.out.println("1st Approach");
//       Map<Character,Integer> finalemap=ocurranceCalculation(name);
//        //The for loop iterates through all the characters in the input string word,
        // which has a length ofn. Hence, this operation takes 𝑂(𝑛)

        //map.containsKey() and map.put() both are
        //O(1) in average case but can degrade to
        //O(n) in worst case if hash collisions occur (very rare due to good hashing algorithms in Java).
        //Since these operations are done once for each character in the string, their average complexity is
        //O(1) per iteration.

     //  System.out.println(finalemap.toString());

//
//        //2nd Approach
//        System.out.println("2nd Approach");
//        Map<Character,Integer> optimized_Approch = OptimizedocurranceCalculation(name);
//        //The for loop iterates through all the characters in the input string word,
        // which has a length ofn. Hence, this operation takes 𝑂(𝑛)

        //This version still has a time complexity of
        //O(n) in the average case.But this open is more optimized Code
//       System.out.println(optimized_Approch.toString());
//
//        System.out.println("Revese order Programe without changing the position----------");

        //revese the charater without changing the position of word
//        String Statement = reverseCharacterwithoutChangingPoistion(word);
//        System.out.println(Statement);
//
//        System.out.println("Revese order String ----------");
//        //reverse the word
//        String str= reverseWord(name);
//        System.out.println(str);

     //   System.out.println("Remove the dupliacte character from  String ----------");
        //remove duplicate Character
        String str1= removeDuplicateCharter(name.toLowerCase());
     //   System.out.println(str1);

    }
}

