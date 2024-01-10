package org.example.top150interviews;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Long> wordCounts = Stream.of(paragraph.toLowerCase().split("\\W+"))
                .filter(word -> !Arrays.asList(banned).contains(word))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return Collections.max(wordCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        String mostFrequentWord = mostCommonWord(paragraph, banned);
        System.out.println("The most common word is: " + mostFrequentWord);
    }
}
