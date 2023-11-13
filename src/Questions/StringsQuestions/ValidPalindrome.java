package Questions.StringsQuestions;

public class ValidPalindrome {
    public static void main(String[] args) {
        // String s = "A man, a plan, a canal: Panama";
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  
        System.out.println(s);
        char[] phrase = s.toCharArray();
        for (int i = 0, j = phrase.length - 1; i < phrase.length;) {

            if (phrase[i] == (phrase[j])) {
                i++;
                j--;

            } else {
                System.out.println("true");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

}
