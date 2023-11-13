package Questions.StringsQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"}; 
        String pattern = "abb";
        Solution.findAndReplacePattern(words,pattern);
        
    }
    private static class Solution {
    public static  List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> s= new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            HashMap<String, String> map = new HashMap<>();
            String replaced ="";
            for (int j = 1,k=0; j <=words[i].length(); j++) {

                // System.out.print(words[i].substring(k, j));
                // System.out.println(pattern.substring(k, j));
                map.put(words[i].substring(k, j),pattern.substring(k, j));
                
                k++;
            }
            System.out.println(map.get("c"));
            
            
        }
        s.add("s");
        return s;
    }
}
    
}
