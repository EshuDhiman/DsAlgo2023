package Questions.Arrays;

public class NumberSmallerThanCurrent {
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        smallerNumbersThanCurrent(nums);

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length
            ;j++){
                if(nums[i]>nums[j]){
                    arr[i]=arr[i]+1;
                }
            }
        }
        return arr;
        
    }
}
