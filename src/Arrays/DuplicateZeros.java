package Arrays;
//
//Input: arr = [1,0,2,3,0,4,5,0]
//        Output: [1,0,0,2,3,0,0,4]
//        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
/*
loop though the array and find all the positions of 0s in the array
take the last position and shift the entire rhs of the array and insert 0
repeat this for remaining positons of 0s.

 */

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {

        Arrays.stream(arr)
                .forEach(System.out::println);

        System.out.println("End");

        ArrayList<Integer> zerosPos = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                zerosPos.add(i);
            }
        }
        zerosPos.stream()
                        .forEach(System.out::println);
        System.out.println("End of 0 index");

        while (zerosPos.size() !=0 ){
            Integer lastZeroPosition = zerosPos.get(zerosPos.size() - 1);
            for (int i = arr.length-2; i >= lastZeroPosition; i--) {
                arr[i+1] = arr[i];
            }
           // if(indexToInsert0AfterShifting != -1) arr[indexToInsert0AfterShifting] = 0;
            zerosPos.remove(zerosPos.size()-1);
        }
        System.out.println("After duplicating");
        Arrays.stream(arr)
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] orginalArr = arr;
        System.out.println("First array");
        Arrays.stream(arr)
                        .forEach(System.out::println);
        System.out.println("End");
        duplicateZeros(arr);


    }
}
