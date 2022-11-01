package Arrays;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Arrays.sort(nums);
        int [] newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            newNums[i] = i+1;
        }
        //array to arrayList
        List<Integer>arrayList = IntStream.of(nums).boxed().collect(Collectors.toList());

        for(int j = 0; j < nums.length; j++){
            Integer key = newNums[j];
            if(Arrays.asList(newNums).contains(key)){
                // Remove the specified element
                arrayList.remove(key);

            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
}
