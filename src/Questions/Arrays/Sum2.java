package Questions.Arrays;

import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int a[] = new int[2];
        boolean isBreaked=false;
        //outer loop for traversing the whole array
        for (int i = 0; i < nums.length ; i++) {
            if(isBreaked){
                break;
            }
            
            // inner loop for comparing the values of num[starting index] + nums[every other index in the array] = target
            // starting index changes with 
            // outer loop when we finishes comparing index 1 values with rest of the values we compare index 2 with rest of the values and so on till the last index become the starting index
            // we have started from the back of the array
            for (int k = nums.length-1; k>=i; k--) {
                // if condition states that if value of nums[i] + nums[k] = target and k!=i means if k=i then they will add the same index that why we put k!=i
                //here k is used to get add with the starting index
                //The variable k is initialized to nums.length-1 instead of nums.length because arrays in Java are zero-indexed, which means that the last element in the array is at index nums.length-1. Therefore, if we initialize k to nums.length, we will get an ArrayIndexOutOfBoundsException error when we try to access the element at index k in the loop.
                if (nums[i] + nums[k] == target && k!=i ) {
                    a[0] = i;
                    a[1] = k;
                    isBreaked=true;
                    break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }

}
public class Sum2 {
    public static void main(String[] args) {
        int[] nums = { -3,4,3,90};
        int target = 0;
        Solution.twoSum(nums, target);

    }
}   