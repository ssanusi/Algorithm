package com.ssanusi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {7, 3, 5, 2, 3, 1, 5, 8};
        var sorter = new BucketSort();
        sorter.sort(numbers, 3);
        System.out.println(Arrays.toString(numbers));

        var search = new Search();
        var result = search.exponentialSearch(numbers, 7);
        System.out.println(result);

        var count = StringUtils.countVowels("hello world");
        System.out.println(count);

        var reverseStr = StringUtils.reverse("blue");
        System.out.println(reverseStr);

        var reverseWord = StringUtils.reverseWord("I love You");
        System.out.println(reverseWord);

        var removeDup = StringUtils.removeDuplicate("Trees are Beautiful");
        System.out.println(removeDup);

        var charMax = StringUtils.getMaxOccuringChar("Trees are Beautiful");
        System.out.println(charMax);

        var capitalize = StringUtils.capitalize("today is a great day");
        System.out.println(capitalize);

        var isAnagram = StringUtils.areAnagram2("ABCD", "DCBA");
        System.out.println(isAnagram);

        var isPalindrome = StringUtils.isPalindrome("ABBa ");
        System.out.println(isPalindrome);
    }




}
