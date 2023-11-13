package Concepts.Searching;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int arr[] , int s){
        Arrays.sort(arr);
        int mid , high , low;
        low = 0; high = arr.length-1;
        while (low<=high) {
            mid = (high+low)/2;
            if (s==arr[mid]) {
                System.out.println(mid);
                return mid;
                
            }
            if (s<arr[mid]) {
                high = mid -1; 
            }
            else{
                low = mid +1;
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        binarySearch(arr, 4);   
        // System.out.println(arr.length);
    }
}
 