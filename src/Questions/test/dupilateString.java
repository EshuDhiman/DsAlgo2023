package Questions.test;

public class dupilateString {
    public static void main(String[] args){
        String s = "aabbccddefg";
        duplicate(s);
    }
    public static void duplicate(String s){
        int count =0;
        char[] x = s.toCharArray(); 
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if(x[i]==x[j]){
                    System.out.println(x[i]);
                }
            }
        }
    }
    
}
