package test;

import java.util.HashMap;
import java.util.Map;

public class FindOddCharacter {
    public static void main(String[] args) {
        String s1 = "anup";
        String s2 = "an1up";

        char extraChar = findExtraChar(s1, s2);
        System.out.println("Extra character is: " + extraChar);

        char ch = findExtraCharacter(s1, s2);
        System.out.println("Extra character is: " + ch);
    }

    public static char findExtraChar(String s1, String s2) {
        int xor = 0;

        // XOR all characters in s1
        for (char c : s1.toCharArray()) {
            xor ^= c;
        }


        // XOR all characters in s2
        for (char c : s2.toCharArray()) {
            xor ^= c;

        }

        // Result is the extra character
        return (char) xor;
    }

    public static char findExtraCharacter(String str1, String str2) {
        String longer = str1.length() > str2.length() ? str1 : str2;
        String shorter = str1.length() > str2.length() ? str2 : str1;

        Map<Character, Integer> freqMap = new HashMap<>();

        // Step 1: Count characters of the longer string
        for (char c : longer.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Subtract frequencies using shorter string
        for (char c : shorter.toCharArray()) {
            freqMap.put(c, freqMap.get(c) - 1);
        }

        // Step 3: Find the character with count 1
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // Return null character if no extra character found
    }
}

