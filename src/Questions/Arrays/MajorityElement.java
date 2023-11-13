package Questions.Arrays;

import java.util.Arrays;
// 

// 1. `if(nums[i-1]==nums[i])`: This condition checks if the current element `nums[i]` is equal to the previous element `nums[i-1]`. If they are equal, it means that the current element is a duplicate of the previous element.

// 2. `if(k<nums.length/2) { k++; }`: This condition checks if the counter variable `k` is less than half of the length of the input array (`nums.length/2`). If it is, it means that the number of occurrences of the current element has not exceeded half of the array length yet. In that case, the counter `k` is incremented by 1.

// 3. `if(k>((nums.length)/(float)(2))) { break; }`: This condition checks if the counter variable `k` has become greater than half of the array length (`(nums.length)/(float)(2)`). If it is, it means that the majority element has been found, as it appears more than half of the array length. In that case, the loop is terminated early using the `break` statement.

// In summary, these conditions are used to track the number of occurrences of a potential majority element while iterating through the sorted array. Once the majority element is found, the loop is terminated and the function returns that element.

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        majorityElement(nums);
    }
    public static int majorityElement(int[] nums) {
        
        int k=0;
        Arrays.sort(nums); 
        for(int i = 1; i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                // here we used jab tk k ki vlaue array ke half size se choti h tb tk usko increment kro vrna jab k ki value increase ho gai half of the array size se to increment na kro is se hoga kya agr kuch cases me elements ki jo freq hai wo jda hai to kai baar cases me sahi postion na return krte hue uske ek aage ki value return kr rha tha to mene ye conditon lga di
                if(k<nums.length/2){k++;}
            }
            if(k>((nums.length)/(2))){
                break;
            }
            
        }
        System.out.println(nums[k]);
        return nums[k];
    }
    
}
