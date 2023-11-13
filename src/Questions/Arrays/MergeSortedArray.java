package Questions.Arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String args[]) {
        int[] nums1 = {1, 2, 3, 0, 0, 0 };
        
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p = nums1.length; 
        for(int i=0;i<nums1.length;i++){
        nums1[p]=nums2[i];
        p++;
    
    }

}
