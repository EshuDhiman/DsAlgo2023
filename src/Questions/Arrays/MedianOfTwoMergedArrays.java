package Questions.Arrays;

import java.util.Arrays;

class Fm {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        int[] newArr = new int[nums1.length + nums2.length];
        // System.out.println(newArr.length);
        // change the order
        for (int i = 0; i < nums1.length; i++) {
            newArr[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            newArr[nums1.length + j] = nums2[j];
        }
        Arrays.sort(newArr);
        System.out.println(newArr[(newArr.length / 2)-1]);
        System.out.println(newArr[(newArr.length / 2)]);
        if (newArr.length % 2 == 0) {
            // dont be sacred all this calculation is just to get the right postion of the array element
            //float is used on the operand to get decimal vlaue not yhe round of value
            median = ((newArr[(newArr.length / 2)-1] + (float)(newArr[(newArr.length / 2) ])) / 2);
        } 
        
        else {
            median = newArr[newArr.length / 2];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);

        }
        System.out.print(" ");
        System.out.println(median);
        return median;
    }
}

public class MedianOfTwoMergedArrays {
    public static void main(String[] args) {
        int[] n1 = { 1, 2 };
        int[] n2 = { 3, 4 };
        Fm.findMedianSortedArrays(n1, n2);

    }
}