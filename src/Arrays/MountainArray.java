package Arrays;

public class MountainArray {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int middleIndex = -1;
        int nextIndex = -1;

        for(int i =0; i < arr.length-1; i++){
           nextIndex = i+1;
            if(arr[nextIndex] == arr[i]) return false;
            if(arr[nextIndex]<arr[i]){
                middleIndex = i;
                i = arr.length;
            }
        }

        if (middleIndex ==0) return false;

        boolean isMountainArray = false;
        for(int i =0; i < arr.length-1; i++){
           nextIndex = i+1;
            if(arr[nextIndex]>arr[i] && i < middleIndex){
                isMountainArray = true;

            }
            else if(arr[nextIndex]<arr[i] && i >= middleIndex){
                isMountainArray = true;
            }
            else{
                isMountainArray = false;
                return isMountainArray;

            }
        }
        return isMountainArray;
    }

    public static void main(String[] args) {
        int arr[] = {3,7,6,4,3,0,1,0};
        System.out.println(validMountainArray(arr));
    }
}
