import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number < 0){
            System.out.println("No factorial for negative number");
        }else{
            int factorial = 1;
            for(int i=1;i<=number;i++) {
                factorial = factorial * i;
            }
             System.out.println("factorial of " + number + " is " + factorial);

        }
    }
}
