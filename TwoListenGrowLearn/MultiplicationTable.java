public class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("              Multiplation Table");

        System.out.print("    ");
        for(int i=1;i<=9;i++)
            System.out.print("   " +i);
      System.out.println("\n----------------------------------------");

      for(int j = 1; j <=9; j++){
          System.out.print(j +" | ");
          for(int k = 1; k <=9; k++){
              System.out.printf("%4d", j * k);
          }
          System.out.println();
      }
    }
}
