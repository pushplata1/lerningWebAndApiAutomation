package org.example.Practice_Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programe4 {
    public static void main(String[] args) {

        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Alice", "Bob"};
        int[] scores = {85, 76, 92, 43, 67, 91, 85};

        // Map to store multiple scores for the same student
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < students.length; i++) {

            map.putIfAbsent(students[i], new ArrayList<>());
            map.get(students[i]).add(scores[i]);
        }

        // Output Charlie's scores
        System.out.println("Charlie's scores: " + map.get("Charlie"));

        // Optional: Print the entire map
        System.out.println("Complete Map: " + map);
    }
}
