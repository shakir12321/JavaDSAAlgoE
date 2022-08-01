package Arrays;

import java.util.Arrays;

/*
Given an array nums of integers, return how many of them contain an even number of digits.
Input: nums = [12,345,2,6,7896]
Output: 2
 */

// time O(n) , space O(n)
public class EvenNumberoDigits {

    public static int findNumbers(int[] nums) {
        int[] digitCount = new int[nums.length];
        int digitCountIndex=0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int countDigit = 1;
            while(num/10 != 0){
                num = num/10;
                int quo = num%10;
                countDigit++;
            }
            digitCount[digitCountIndex++] = countDigit;
        }

        Arrays.stream(digitCount)
                .forEach(System.out::println);

        int evenNumberCount = 0;

        evenNumberCount = (int) Arrays.stream(digitCount)
                .filter(i ->
                i%2 == 0)
                .count();
        return evenNumberCount;
    }



    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,22,444444};

        System.out.println("Even number count " + findNumbers(nums));

    }
}
