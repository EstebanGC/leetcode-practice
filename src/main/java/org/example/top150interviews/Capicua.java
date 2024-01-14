package org.example.top150interviews;

import java.util.Arrays;

public class Capicua {
    public void isCapicua(int number) {
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)) {
            System.out.println(numberText + " is capicua!");
        } else {
            System.out.println(numberText + " is not capicua!");
        }
    }

    public static void main(String[] args) {

        Capicua capicua = new Capicua();

        int number = 11211;

        capicua.isCapicua(11211);

    }
}
