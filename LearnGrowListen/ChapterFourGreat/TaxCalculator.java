import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        while(count <= 3){

            System.out.print("Enter citizen name: ");
            String name = input.next();

            System.out.print("Enter citizen earnings for a given year: ");
            double earnings = input.nextDouble();

            double tax;

            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = (30000 * 0.15) + ((earnings - 30000) * 0.20);
            }

            System.out.println("Citizen: " + name);
            System.out.printf("Earnings: $%.2f\n", earnings);
            System.out.printf("Total tax: $%.2f\n", tax);
	count++;
        }

         }
}


/*determine total tax for three citizen
tax rate 15% for earning up to 30000
20% for earning excess
list citizen names, earnings in giving year.
input this information for each citizen.
determine and display citizen total tax.*/


