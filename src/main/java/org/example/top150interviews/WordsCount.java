package org.example.top150interviews;

import java.util.HashMap;
import java.util.List;

public class WordsCount {
    public static HashMap<String, Integer> wordsCount(List<String> documents) {
        HashMap<String, Integer> wordsCount = new HashMap<>();

        for (String document: documents){
            String[] words = document.split("\\s+");

            for (String word: words) {
                wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordsCount;
    }

    public static void main(String[] args) {
        List<String> documents = List.of(
                "Este es un ejemplo de documento.",
                "Otro ejemplo de documento con palabras.",
                "Este documento también tiene palabras."
        );

        HashMap<String, Integer> result = wordsCount(documents);


        for (String word : result.keySet()) {
            System.out.println(word + ": " + result.get(word));
        }
    }
}
