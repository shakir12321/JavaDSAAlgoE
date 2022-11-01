package Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j=nums.length-1;
        if(j == 0){
            if(nums[j] == val) return 0;
            else return 1;
        }
        while(i < j){
            while (nums[j] == val && j>0){
                j--;
                if(j==0) return 0;
            }
            if(nums[i] == val){
                swap(i,j,nums);
                j--;
                i++;
            }
            else i++;
        }
        return ++i    ;
    }
    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4,5};
//        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,4));
    }
}