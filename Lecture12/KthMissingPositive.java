package Lecture12;

public class KthMissingPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int ans = solution(arr, k);
        System.out.println(ans);
    }

    // T.C.:- O(k log n)
    // S.C.:- O(1)
    public static int solution(int[] arr, int k) {
        int start = 1;
        int count = 0;
        while(count != k) {
            boolean res = binarySearch(arr, start);

            if(res == false) {
                // number is missing
                count++;
            }

            start++;
        }

        return start-1;
    }

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = left + (right-left)/2;

            if(arr[mid] == target) {
                return true;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }

        return false;
    }
}
