
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

package Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class findMaxConsequitiveNumber {
    public static OptionalInt findMaxConsecutiveOnes(int[] nums) {
        int consequiteOnes = 0;
        int[] onesCount = new int[nums.length];
        int onesCountIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && nums[i] == 1) {
                consequiteOnes++;
                i++;
            }
            onesCount[onesCountIndex] = consequiteOnes;
            onesCountIndex++;
            consequiteOnes = 0;
        }

        OptionalInt maxOnes = Arrays.stream(onesCount)
                .max();

        return maxOnes;

    }

//    Input: nums = [1,1,0,1,1,1]

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
       OptionalInt num =  findMaxConsecutiveOnes(nums);
        System.out.println("Max "+num.getAsInt());



    }

}

