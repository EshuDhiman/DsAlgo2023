package Questions.Arrays;
// digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
public class PluseOne {
public static void main(String[] args) {
    int[] arr = {4,3,2,1};
    plusOne(arr);
    
}
public static  int[] plusOne(int[] digits) {
    
    if (digits[digits.length-1]==9) {
        int [] arr = new int[digits.length+1];
        
        for (int i : arr) {
            arr[i] = digits[i];
        }
        arr[digits.length-1] = 1;
        arr[digits.length] = 0;
        return arr;
        
    }
    if (digits.length!=0) {
        int num = digits[digits.length-1]+1;
        digits[digits.length-1] = num;
        
    }
    return digits;
    

}
    
}
