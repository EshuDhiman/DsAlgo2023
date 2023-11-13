package Questions.Arrays;

public class TargetEmployees {
    public static void main(String[] args) {
        int [] hours = {0,1,2,3,4}; 
        int target = 2;
        Solution.numberOfEmployeesWhoMetTarget(hours,target);
    }    
    private static class Solution {
         public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
            int count=0;

            for (int i = 0; i < hours.length; i++) {
                if(target<=hours[i]){
                    count++;
                }
            }
            System.out.println(count);
            return count;
        }
    }
}
