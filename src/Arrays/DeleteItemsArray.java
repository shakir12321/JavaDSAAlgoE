package Arrays;

public class DeleteItemsArray {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i] == val){
                count++;
                for(int j = i; j <nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
            }
        }
        return nums.length - count;


    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        removeElement(arr,2);

    }
}
