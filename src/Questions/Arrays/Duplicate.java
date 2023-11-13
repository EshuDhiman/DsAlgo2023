package Questions.Arrays;

import java.util.Arrays;
public class Duplicate{
    static boolean duplicateArr(int nums[]){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums.length-1!=i){
                if(nums[i]==nums[i+1])
                System.out.println("true");
                return true;
            }

        }
        System.out.println("false");                
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,1};
        duplicateArr(nums);
        
    }
}