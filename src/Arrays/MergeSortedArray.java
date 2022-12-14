package Arrays;
/*Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

 */

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m-1;
        int r2 = n-1;


        for(int w = m+n -1; w>0; w--) {
            if (r1 >= 0 && r2 >= 0) {
                nums1[w] = (nums1[r1] > nums2[r2] )? nums1[r1--]: nums2[r2--];
            }
            else if (r2 > 0) {
                nums1[w] = nums2[r2--];
            }
            else{
                nums1[w] = nums1[r1--];
            }
        }
        Arrays.stream(nums1)
                .forEach(System.out::println);
           }





    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

//        int[] nums1 = {2,0};
//        int m = 1;
//        int[] nums2 = {1};
//        int n = 1;
        merge(nums1,m,nums2,n);
    }

}
