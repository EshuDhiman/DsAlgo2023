package Questions.Patterns;

// 111111*
// 11111***
// 1111*****
// 111*******
// 11*********
public class Pattern8 {
    public static void main(String[] args) {
        int temp = 9;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < temp; j++) {

                System.out.print("*");

            }
            temp = temp - 2;
            System.out.println("");
        }

    }
}
