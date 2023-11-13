package Questions.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        for (int index = 0; index<=4 ; index++) {
            for (int i = 0; i <=index; i++) {
                System.out.print("*");               
            }
            System.out.println("");
        }
    }
}