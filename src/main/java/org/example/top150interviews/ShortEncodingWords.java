package org.example.top150interviews;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortEncodingWords {

    public static int minimumLengthEncoding(String[] words) {
        Set<String> s = new HashSet<>(Arrays.asList(words));

        for (String word: words) {

            if(s.contains(word)) {
                for (int i = 1; i< words.length; ++i){
                    s.remove(word.substring(i));
                }
            }
        }

        int ans = s.size();
        for (String word: s)  ans += word.length();
        return ans;
    }
    public static void main(String[] args) {
        String[] words = {"time", "me", "bell"};
        int result = minimumLengthEncoding(words);
        System.out.println("Minimum Length Encoding: " + result);
    }
}