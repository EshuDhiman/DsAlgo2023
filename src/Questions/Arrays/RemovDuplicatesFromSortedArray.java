package Questions.Arrays;

public class RemovDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,4,4,4,4,5,6,7,8,};
        removeDuplicates(nums);
    }
    
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // If there are no numbers, then there are no duplicates to remove
        }
        
        int k = 1; // We start with the assumption that there's at least one unique number
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                // If the current number is different from the last unique number we found,
                // then it's a new unique number, and we save it in the array.
                nums[k] = nums[i]; // Save the new unique number
                k++; // Move to the next position to save another unique number
            }
        }
        
        return k; // The final value of 'k' tells us how many unique numbers we found
    }

    }

