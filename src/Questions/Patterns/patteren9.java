package Questions.Patterns;

//    111111*
//    11111*
//    1111*
//    111*
//    11*
public class patteren9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {

                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {

                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
