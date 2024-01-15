package org.example.top150interviews;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseString {

    public static String reverse(String text) {
        return new StringBuilder(text)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {

        String text = "whatever";

        ReverseString reverseString = new ReverseString();

        String reversedText = reverseString.reverse(text);

        System.out.println(reversedText);
    }
}
