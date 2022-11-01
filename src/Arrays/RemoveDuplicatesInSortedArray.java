package Arrays;

import java.util.Arrays;
import java.util.EnumSet;

public class RemoveDuplicatesInSortedArray {
    //Time: O(n)
    //Space: O(1)

    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j-1] != nums[j]){
                nums[insertIndex] = nums[j];
                insertIndex++;
            }
        }
        System.out.println("After removing");
        Arrays.stream(nums)
                .forEach(System.out::println);
        System.out.println("i "+insertIndex);
        return insertIndex;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,2,3,3,4};
//        int[] nums = {1,1,2};
//        int[] nums = {1,1};
        removeDuplicates(nums);
    }
}
