package Questions.test;

import java.util.HashMap;
import java.util.Scanner;

// good 
public class Test {
    public static void main(String[] args) {
        String S = "good";
        testFun(S);

    }

    static void testFun(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int count = 0;
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    count++;
                    mp.put(s.charAt(i), count);
                }
            }
            if (count == 0) {
                mp.put(s.charAt(i), count);

            } else {
                count = 0;
            }
        }
        System.out.println(mp);
        int max = 0;
        char maxC=c[0];
        char minC=c[0];
        int min = 0;
        for (int i = 0; i < c.length; i++) {

            if (max < mp.get(c[i])) {
                max = mp.get(c[i]);
                maxC=c[i];

            }
            if (min > mp.get(c[i])) {
                min = mp.get(c[i]);
                minC=c[i];

            }
        }

        System.out.println("MAX" + " " + max+" "+ maxC);
        System.out.println("MIN" + " " + min+" "+ minC);
    }
}
