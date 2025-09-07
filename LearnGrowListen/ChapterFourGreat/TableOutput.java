public class TableOutput {
    public static void main(String[] args){


	System.out.printf("%-10s%-10s%-10s%-10s%n","N","N2","N3","N4");
	

	for(int count = 1;count <= 5;count++){

	int N2 = count * count;
	int N3 = N2 * count;
	int N4 = N3 * count;

	 
System.out.printf("%-10d%-10d%-10d%-10d%n", count,N2,N3,N4);

  }






 
   }
}