package org.practice.dsa.string;

import java.util.HashSet;
import java.util.Set;

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing English letters (lower or upper-case), return true if sentence is a pangram, or false otherwise.
 *
 * Note: The given sentence might contain other characters like digits or spaces, your solution should handle these too.
 *
 * Example 1:
 *
 * Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
 * Output: true
 * Explanation: The sentence contains at least one occurrence of every letter of the English alphabet either in lower or upper case.
 * Example 2:
 *
 * Input: sentence = "This is not a pangram"
 * Output: false
 * Explanation: The sentence doesn't contain at least one occurrence of every letter of the English alphabet.
 */
public class Angram {

    /**
     * We can use a HashSet to check if the given sentence is a pangram or not. The HashSet will be used to store all
     * the unique characters in the sentence. The algorithm works as follows:
     *
     * Converts the sentence to lowercase.
     * Iterate over each character of the sentence using a loop.
     * Add each character to the HashSet.
     * After looping through all characters, compare the size of the HashSet with 26 (total number of alphabets). If the
     * size of the HashSet is equal to 26, it means the sentence contains all the alphabets and is a pangram, so the
     * function will return true. Otherwise, it will return false.
     *
     * TC: O(N), where n is the length of the sentence, SC: O(1) -> max hashset size is 26
     */
    boolean usingSet(String input) {
        // return false for invalid input
        if(input.isBlank() || input.length() < 26) {
            return false;
        }
        // Converts the sentence to lowercase.
        input = input.toLowerCase();
        Set<Character> characerSet = new HashSet<>();
        // Add each character to the HashSet
        for(char ch : input.toCharArray()) {
            if(Character.isLetter(ch)) {
                characerSet.add(ch);
            }
        }
        return characerSet.size() == 26;
    }

    /**
     * Convert all characters to lower case
     * Create a boolean array of size 26
     * Iterate input and keep array value at index of character as true
     * Iterate the array and if we find any value as false, then it is not angram
     */
    boolean usingArray(String input) {
        // return false for invalid input
        if(input.isBlank() || input.length() < 26) {
            return false;
        }
        input = input.toLowerCase();
        boolean[] auxiliary = new boolean[26];
        for(char ch : input.toCharArray()) {
            if(Character.isLetter(ch)) {
                auxiliary[ch - 'a'] = true;
            }
        }
        for(boolean flag : auxiliary) {
            if(!flag) {
                return false;
            }
        }
        return true;
    }
}
