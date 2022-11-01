package Arrays;
//Input: heights = [1,1,4,2,1,3]
//        Output: 3
//        Explanation:
//        heights:  [1,1,4,2,1,3]
//        expected: [1,1,1,2,3,4]
//        Indices 2, 4, and 5 do not match.

import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] newHeight = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            newHeight[i] = heights[i];
        }
        newHeight = Arrays.stream(heights)
                .sorted()
                .toArray();


        int diff = 0;
        for (int i = 0; i < heights.length; i++) {
            if (newHeight[i] != heights[i]) diff++;
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));


    }

}
