package org.example.TimeComplexityPOrograme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class studentScores {

    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Alice", "Bob"};
        int[] scores = {85, 76, 92, 43, 67, 91, 85};

        Map<String,List<Integer>> map = new HashMap<>();

        for(int i=0;i<students.length;i++){
            map.putIfAbsent(students[i],new ArrayList<>());
            map.get(students[i]).add(scores[i]);
        }

        System.out.println(map.toString());
        System.out.println(map.get("Charlie"));
    }
}
