package Questions.Arrays;

import java.util.HashMap;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        String value = "MCMXCIV";
        // romanToInt(value);
        ImprovedromanToInt(value);

    }

    static int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);     
        int sum = 0;
        for (int i = 0,j=1; i < s.length(); i++) {
            String a = s.substring(i, j);
            System.out.print(a);
            if(map.containsKey(a)){
                if(map.containsKey(a))
                sum=sum+map.get(a);
            }
            j++; 
        }
        //contains check weather these charaters appear together in a string 
        if (s.contains("IV")) {
            sum=sum-2;
        }
        if (s.contains("IX")) {
            sum=sum-2;
        }
        if (s.contains("XL")) {
            sum=sum-20;
        }
        if (s.contains("XC")) {
            sum=sum-20;
        }
        if (s.contains("CD")) {
            sum=sum-200;
        }
        if (s.contains("CM")) {
            sum=sum-200;
        }

        System.out.println(sum);
        return sum;


    }
    public static int ImprovedromanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = map.get(s.charAt(i));
            System.out.println("currValue = " + currValue);
            System.out.println("prevValue = " + prevValue);

            if (currValue < prevValue) {
                sum -= currValue;
            } else {
                sum += currValue;
            }

            prevValue = currValue;
        }
        System.out.println(sum);
        return sum;
    }

}
