package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeNumberSum {
    public static int[][] threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        
        int cNumber = 0;
        int left = 0;
        int right = 0;
        int[][] result = new int[array.length][3];
        int idx = 0;
        Arrays.stream(array).sorted();

        for (int i = 0; i < array.length; i++) {
            cNumber = array[i];
            left  = 0;
            right = array.length-1;
            while(left < right ){
                if ((cNumber + array[left] + array[right]) == targetSum ){
                    result[idx] = new int[]{cNumber, left, right};
                    idx++;
                }
                else if((cNumber + array[left] + array[right]) < targetSum){
                    left = left + 1;
                }
                else{
                    right = right -1;
                }
            }
        }
        
            return result;


    }

    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
    }
}
