package Questions.Maths;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        int[] nums = {-5,-3,-2,-1};
        sortedSquares(nums);
    }
     public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        
    }

    
}
