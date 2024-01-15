package org.example.top150interviews;
import java.util.*;

public class RemoveDuplicates {

    public int[] removeDuplicates(int[] array) {
        return Arrays.stream(array)
                .filter(num -> num % 2 != 0)
                .distinct()
                .sorted()
                .toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
                21, 23, 25, 27, 29, 22, 24, 26, 28, 30, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 32, 34, 36, 38, 40, 42, 44,
                46, 48, 50, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50};

        RemoveDuplicates remover = new RemoveDuplicates();
        int[] result = remover.removeDuplicates(array);
        System.out.println("No duplicates-Sorted: " + Arrays.toString(result));
    }
}
