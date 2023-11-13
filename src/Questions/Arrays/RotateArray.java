package Questions.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        // rotate 3 steps to the right: [5,6,7,1,2,3,4]
        int k = 3;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within the array size
    
        int temp;
        for (int i = 0; i < k; i++) {
            temp = nums[n - 1]; // Store the last element
            // Shift all elements to the right by one position
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp; // Set the first element to the stored value
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    
}
