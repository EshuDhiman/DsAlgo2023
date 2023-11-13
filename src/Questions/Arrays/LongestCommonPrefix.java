package Questions.Arrays;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        longestCommonPrefix(str);

    }

    public static String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs); //will sort the array alphabetical order one by one
        //if the array is sorted that means sare words jo alphabeticaly ek baad ek aate hai wo bhi order me honge yani prefix wale sab ek sath honge
        String str1=strs[0]; // isliyebham sirf first word
        String str2=strs[strs.length-1]; 
        // and last word ko compare krege character by charater jha wo chracter match n hua vha break kro and return kro substring us charcter tk jha loop break hua
        int index=0;
        while(index<str1.length()){
            if(str1.charAt(index)==str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        System.out.println(str1.substring(0, index));
        return index==0?"":str1.substring(0, index);
    }
}
