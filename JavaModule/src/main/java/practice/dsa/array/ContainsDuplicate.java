package practice.dsa.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums= [1, 2, 3, 4]
 * Output: false
 * Explanation: There are no duplicates in the given array.
 * Example 2:
 *
 * Input: nums= [1, 2, 3, 1]
 * Output: true
 * Explanation: '1' is repeating.
 */
public class ContainsDuplicate {

    /**
     * TC: O(N^2), SC: O(1)
     */
    boolean usingBruteForce(int[] numbers) {
        // return false when input is null or length is <= 1
        if(numbers == null || numbers.length <= 1) {
            return false;
        }

        // compare each element to all other elements
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * TC: O(N), SC: O(N)
     */
    boolean usingHashSet(int[] numbers) {
        // return false when input is null or length is <= 1
        if(numbers == null || numbers.length <= 1) {
            return false;
        }
        Set<Integer> uniqueSet = new HashSet<>();
        for(int number : numbers) {
            if(!uniqueSet.add(number)) { // when set.add() returns false, means unable to add element since it already exist
                return true;
            }
        }
        return false;
    }

    /**
     * TC: O(NlogN), SC: O(1) or O(N)  -> depending on sorting algorithm used
     */
    boolean usingSort(int[] numbers) {
        // return false when input is null or length is <= 1
        if(numbers == null || numbers.length <= 1) {
            return false;
        }
        // iterate to validate the already sorted case
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i-1] == numbers[i]) {
                return true;
            }
        }
        int[] freqArray = new int[12];
        Arrays.stream(freqArray).filter(n -> n > 1).map(n -> n*(n-1)/2).sum();

        // sort the array
        Arrays.sort(numbers);
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i-1] == numbers[i]) {
                return true;
            }
        }
        return false;
    }

}
