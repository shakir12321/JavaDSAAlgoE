package Arrays;

import java.util.ArrayList;
import java.util.Collections;
/*
Input: nums = [1,0,1,1,0,1]
Output: 4
 */


public class FindMaxCount {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int i = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;
        int ncount = 0;
        while(i < nums.length-1){
            while(i < nums.length-1 && nums[i] == 1) {
                count++;
                i++;
            }
            while(nums[i] !=1) {
                ncount++;
                i++;
            }
            if(ncount >0) {
                al.add(count);
            }
            count = 0;
            ncount = 0;
           // i++;
        }
        Collections.sort(al, Collections.reverseOrder());

        return al.get(0)+al.get(1)+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
