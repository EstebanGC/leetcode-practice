package org.example.top150interviews;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesHashSet {

    public static boolean hasDuplicates(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>();

        for (Integer number: numbers) {
            if(setNumbers.contains(number)) {
                return true;
            }
            setNumbers.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1);

        boolean hasDuplicates = hasDuplicates(numbers);

        System.out.println(hasDuplicates); // true
    }

}
