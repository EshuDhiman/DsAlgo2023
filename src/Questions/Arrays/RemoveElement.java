package Questions.Arrays;
import java.util.Arrays;
// The time complexity of the given code is O(n), where n is the length of the input array `nums`. This is because the code iterates through each element of `nums` in the for loop.

// The space complexity of the given code is O(n), where n is the length of the input array `nums`. This is because an additional array `arr` of the same length as `nums` is created to store the modified elements.

// To improve the code, you can use a two-pointer approach instead of creating a new array. Here's an optimized version of the code:

// ```java
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int i = 0;
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != val) {
//                 nums[i] = nums[j];
//                 i++;
//             }
//         }
//         return i;
//     }
// }
// ```

// In this optimized version, we use two pointers `i` and `j` to track the elements. The pointer `j` iterates through the array, and when a non-matching element is found, it is copied to the position pointed by `i`. Finally, `i` represents the new length of the modified array without the specified value.

// This approach avoids creating a new array and achieves the same result with better space efficiency. The time complexity remains O(n) as we still need to iterate through each element in the input array.
public class RemoveElement {
    public static void main(String[] args) {
        int nums[] ={0,1,2,2,3,0,4,2}; int val = 2;
        removeElement(nums, val);
    }

    public static int removeElement(int[] nums, int val) {
        
        int k =0;
        int[] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                k++;
            }
        }

        for(int i =0,j=0; (i)<arr.length;){
            if(nums[j]!=(val)){
                arr[i]=nums[j];
                i++;
                if(j<arr.length-1){
                j++;}
                else if(j>=arr.length-1) {
                    break;
                }
            }
            else{
                if (j<arr.length-1) {
                    j++;    
                }
                else if(j>=arr.length-1) {
                    break;
                }
                

                
            }
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        k=nums.length-k;
        Arrays.sort(nums,0,k);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }
        return k;
    }

    
}
