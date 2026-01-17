package Lecture5;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,8,6,1,5,3,3};
        for(int i = 1; i < arr.length; i++) {
            correctPos(arr, i);
        }

        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    }

    public static void correctPos(int[] arr, int pos) {
        int temp = arr[pos];
        int start = pos-1;
        while(start >= 0) {
            if(arr[start] > temp) {
                // shifting
                arr[start+1] = arr[start];
            } else {
                break;
            }

            start--;
        }

        // either start = -1  or start point to smaller 
        arr[start+1] = temp;
    }
}
