package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }
            else{
                map.put(nums[i],index);
                index++;
        }
        map.put(nums[i], i);
    }
            return result;
}


    public static void main(String[] args) {
        //int[] nums = {2,11,7,15};
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] ans = twoSum(nums, target);
        System.out.println("The ans is : ");
        Arrays.stream(ans)
                .forEach(System.out::println);


    }
}
