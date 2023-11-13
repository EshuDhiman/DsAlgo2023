package Questions.Patterns;

public class Patterb7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int temp = 1;
            for (int j = 1; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
