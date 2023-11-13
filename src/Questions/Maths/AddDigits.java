package Questions.Maths;

public class AddDigits {
    public static void main(String[] args) {
        addDigits(19);
    }
    public static int addDigits(int num) {
        int sum=0;

        if(num==0){
            return 0;
        }
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        if(sum>10){
            //used recursion 
             return addDigits(sum);
        }
    
        return sum;
    }
    
}
