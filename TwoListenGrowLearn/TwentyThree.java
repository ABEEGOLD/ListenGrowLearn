public class TwentyThree {
	public static void main(String[] args) {
		int number = 345678;
		int count = 0;

		while (number > 0) {
			if (number > 0) {
				number = number / 10;
				count++;
			}
			System.out.println("The number count: " + count);


		}
	}
}
 // this if statement made it count one by one,
// becase with just the loop it shows count just once,
// which just show count is 6 digit.
//you can do without it.