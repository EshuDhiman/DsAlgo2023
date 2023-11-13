package Questions.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");

    }

    public static int lengthOfLastWord(String s) {
        s = s.trim(); // trim function removes blank or white spaces from beggining and end of the string but not in between
        System.out.println(s);
        // check if string contains a blank space in b/w else return the length of string coz if there are no blank spaces in the string it means its a single word
        if (s.contains(" ")) {
            //character array
            char[] str = s.toCharArray(); 
            int length = 0;
            //running loop backwards to front
            for (int i = str.length - 1; i > 0; i--) {
                // agr str array ka element != blank space then length ++ krdo
                if (str[i] != ' ') {
                    length++;
                } else {
                    // jab str array ka element ek blank space hoga tab end krdo return krdo kyuki hamne loop back se start kiya hai then back me string ke koi bhi blank spaces nhi hai isliye blank space to in b/w he hogi to jese he hame pehli blank space mili piche se to hamne loop end kr diya
                    return length;
                }
            }
            System.out.println(length);
        } else {
            System.out.println(s.length());
            return s.length();
        }
        return -1;// if string is empty

    }
}
