package com.ssanusi;

import java.util.*;

public class StringUtils {
    public static int countVowels(String str) {
        if (str == null)
            return 0;

        int count = 0;
        String vowels = "aeiou";

        for (var ch : str.toLowerCase().toCharArray())
            if (vowels.indexOf(ch) != -1)
                count++;

        return count;

    }

    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }

    public static String reverseWord(String sentence) {
        if (sentence == null)
            return "";

        var wordsArray = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(wordsArray));
        return String.join(" ", wordsArray);
    }

    public static String removeDuplicate(String str) {
        if (str == null)
            return "";
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (var ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }

        }
        return output.toString();
    }

    public static char getMaxOccuringChar(String str) {
//        Map<Character, Integer> frequency = new HashMap<>();
//        for (var ch: str.toCharArray()){
//            if(frequency.containsKey(ch))
//                frequency.replace(ch, frequency.get(ch) + 1);
//            else
//                frequency.put(ch, 1)
//        }

        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();

        final int ASCII_SIZE = 256;
        int[] frequency = new int[ASCII_SIZE];
        for (var ch : str.toCharArray())
            frequency[ch]++;

        int max = 0;
        char result = ' ';
        for (var i = 0; i < frequency.length; i++)
            if (frequency[i] > max) {
                max = frequency[i];
                result = (char) i;
            }

        return result;
    }

    public static String capitalize(String sentence) {
        if (sentence == null || sentence.trim().isEmpty())
            return "";
        String[] words = sentence.trim().replaceAll(" +", " ").split(" ");

        for (var i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);

    }

    public static boolean areAnagram(String first, String second) {
        if (first == null || second == null)
            return false;

        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static boolean areAnagram2(String first, String second) {
        if (first == null || second == null)
            return false;

        final int ENGLISH_ALPHABET = 26;
        int[] frequency = new int[ENGLISH_ALPHABET];

        first = first.toLowerCase();
        for (var i = 0; i < first.length(); i++)
            frequency[first.charAt(i) - 'a']++;

        second = second.toLowerCase();
        for (var i = 0; i < second.length(); i++) {
            var index = second.charAt(i) - 'a';
            if (frequency[index] == 0)
                return false;

            frequency[index]--;
        }

        return true;
    }

    public static boolean isPalindrome(String word) {
//       var input = new StringBuilder(word);
//       input.reverse();
//       input.toString();
//
//       return input.toString().equals(word);
        if (word == null)
            return false;

        var left = 0;
        var right = word.length() - 1;

        while (left < right)
            if (word.charAt(left++) != word.charAt(right--))
                return false;

        return true;

    }
}
