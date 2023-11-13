package Questions.Patterns;

public class Pattern5 {
public static void main(String[] args) {
    for (int i =1; i <=5; i++) {
        for (int j = 1; j <=i; j++) {
            //insteadt of i , j value is being is used to display coz j's value is updating in the inner loop if i value is used it will be like 11 22 333 but here j is 1 12 123
            System.out.print(j);
            
        }
        System.out.println("");
    }
}    
}
