package org.example.Practice_Program;

import java.util.*;

public class OcurranceOfCharacter {

    public static Map<Character, Integer> logicOfOccuranceOfCharacter(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        word = word.toLowerCase();
        for (int i = 0; i <= word.length() - 1; i++) {

            if (map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            } else {
                map.put(word.charAt(i), 1);
            }

        }

        return map;
    }

    public static StringBuilder removeDuplicateCharacter(String word) {

        char[] chracter = word.toCharArray();
        HashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (Character ch : chracter) {
            if (set.add(ch)) {
                sb.append(ch);
            }
        }

        return sb;
    }

    public static StringBuilder
    reverseString(String word){
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return  sb;
    }

    public static void main(String[] args) {

        Map<Character, Integer> map = OcurranceOfCharacter.logicOfOccuranceOfCharacter("SaudiArabia");

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "---------->" + entry.getValue());
        }

        StringBuilder newword = OcurranceOfCharacter.removeDuplicateCharacter("pushplata");

        System.out.println(newword);

        StringBuilder reveseWord = OcurranceOfCharacter.reverseString("pushplata kumari");

        System.out.println(reveseWord);
    }
}



