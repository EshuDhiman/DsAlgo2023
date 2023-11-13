package Questions.Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={0,1};
        missingNumber(nums);
        
    }
        public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int p1=0;
        int p2=nums.length-1;
        while(p1<nums[nums.length-1]){
            if(nums[p1+1]!=nums[p1]+1){
                System.out.println(nums[p1]+1);
                return nums[p1]+1;
            }
            else{
                p1++;
                System.out.println(nums[p1]);
            }
            
        }
        return 0;
            
        }
    }
    

