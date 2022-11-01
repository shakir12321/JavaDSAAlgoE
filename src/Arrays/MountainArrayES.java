package Arrays;

public class MountainArrayES {
    public static boolean validMountainArray(int[] arr) {
        int N = arr.length;
        if(N < 3) return false;

        int i = 0;

        while(i+1 < N && arr[i]<arr[i+1]){
            i++; //climb the mountain
        }
        //out of the loop, once the reached the peak

        //peak can't be first or last;
        if(i ==0 || i == N-1) return false;

        while(i+1 < N && arr[i]>arr[i+1]){
            i++;
        }
        return i == N-1;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(arr));
    }
}
