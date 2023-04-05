package Questions.BinarySearch;

import java.util.Arrays;

public class FirstOcc {
    static int returnFirstOcc(int arr[], int x) {
        Arrays.sort(arr);
        int low, mid, high;
        low = 0;
        high = arr.length - 1;
        ;
        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                // mid is at 0 index or mid not equal to the 1 index before it agr ek v true hota hai then we find are index of firstocc
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    // System.out.println(mid);
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 1, 1, };
        int x = 1;
        System.out.println((returnFirstOcc(arr, x)));

    }

}
