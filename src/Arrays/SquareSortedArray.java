package Arrays;
/*Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Stream forEach(Consumer action) performs an action for each element of the stream.
Stream forEach(Consumer action) is a terminal operation i.e, it may traverse the stream to produce a result or a side-effect.*/

import java.util.Arrays;

public class SquareSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] squaredNums = Arrays.stream(nums)
                .map(n -> n*n)
                .sorted().toArray();

        return squaredNums;

    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        int[] nums2 = sortedSquares(nums);
        System.out.println("After operation");
        Arrays.stream(nums2)
                .forEach(System.out::println);

    }

}
