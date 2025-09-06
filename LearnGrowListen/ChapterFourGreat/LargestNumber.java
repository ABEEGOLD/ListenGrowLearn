import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();

		int largest = 0;

 	for(int count = 1;count <= 10;count++){
		if(count == 10){
		    System.out.println(count);
		}

	}

	if(number > largest){
		largest = number;
	}


   }
}