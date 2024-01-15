package org.example.top150interviews;

import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentLetter {
    public static void main(String[] args) {
        String text = "This is a sample text to find the most frequent letters.";

        Map<Character, Long> letterCounts = text.toLowerCase()
                .chars()          // Convert string to IntStream of characters
                .filter(Character::isLetter)  // Keep only letters
                .mapToObj(c -> (char) c)      // Convert back to Stream of characters
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Find the entries with the highest count
        long maxCount = letterCounts.values().stream().mapToLong(Long::longValue).max().orElse(0);

        System.out.println("Most frequent letters:");
        letterCounts.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .forEach(entry -> System.out.println(entry.getKey() + " (" + entry.getValue() + ")"));
    }
}
