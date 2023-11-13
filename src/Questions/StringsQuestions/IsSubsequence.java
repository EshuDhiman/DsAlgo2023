package Questions.StringsQuestions;

import java.util.Arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        isSubsequence(s, t);
    }

    public static boolean isSubsequence(String s, String t) {
        
        int p1=0;
        int p2=0;
        while(p2<s.length()&&p1<t.length()){
            if(t.charAt(p1)==s.charAt(p2)){
            p1++;
            p2++;
            }
            else{
            p1++;
            }
        }
        System.out.println(p1 +" "+ p2);
        return p2>=s.length()? true: false;

    }
}
