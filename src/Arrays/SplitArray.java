package Arrays;

public class SplitArray {
    public static int splitArray(int[] nums, int m) {
        //nums must be divided between m people.

        //image if 1 person get it, its the largest sum
        int sum = 0;
        for(int i=0; i < nums.length; i++){
            sum += nums[i];
        }

        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if (max < nums[i]) max = nums[i];
        }

        //so max now has starting point for answers and sum has end point for our ansers.
        //thre real answer for m lies somwhere in between.

        // lets do binary search among the range.
        int diff = sum - max;
        int[] ans = new int[diff];
        int iter = 0;
        for(int i =max; i < sum; i++){
            ans[iter] =i;
            iter++;
        }

        int left = 0;
        int right = ans.length-1;
        // int target;
        int length = 0;

        int leftsum = 0;
        int rightsum = 0;
        while(left < right){
            int count = 0;
            int mid = left + (right-left)/2;
            int target = ans[mid];
             leftsum = 0;
            int i = 0;
            while(leftsum <= target){
                leftsum+=ans[i];
                i++;
            }
            count++;
             rightsum = 0;
            //i = 0;
            while(rightsum <= target){
                rightsum+=ans[i];
                i++;
            }
            count++;
            if (i < ans.length)  // ans is on the right of mid;
            {
                left = mid+1;
            }
            else if(i > ans.length){
                right = mid-1;
            }
            else return leftsum;
        }
        return leftsum;

    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums,m));

    }

    }
