package Questions.BinarySearch;

import java.util.ArrayList;

public class FirstAndLast {
    
    static ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> returnArr = new ArrayList<Long>(2); 
        int low, high,mid;
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
                    returnArr.add((long)(mid));
                    System.out.println(returnArr);
                    break;
                } else {
                    high = mid - 1;
                }
            }
        }
        while (low <= high) {
            mid = (high + low) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                // mid is at 0 index or mid not equal to the 1 index before it agr ek v true hota hai then we find are index of firstocc
                if (mid == n-1 || arr[mid + 1] != arr[mid]) {
                    // System.out.println(mid);
                    returnArr.add((long)mid);
                    System.out.println(returnArr);
                    break;
                } else {
                    low = mid + 1;
                }
            }
        }
        if(returnArr.isEmpty()==true){
            returnArr.add((long)(-1));
            returnArr.add((long)(-1));
            return returnArr;
        }
        else{
            return returnArr;
        }
    }
    public static void main(String[] args) {
        int n=9; 
        int x=5;
        long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
    
        System.out.println(find(arr, n, x));    
    }
}



