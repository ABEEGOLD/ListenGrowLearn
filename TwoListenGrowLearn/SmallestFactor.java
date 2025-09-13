

public class SmallestFactor {
    public static void main(String[] args) {
//        int n = 0;
//        int factor = 2;
//        while (factor <= n) {
//            if (n % factor == 0)
//                break;
//            factor++;
//        }
//        System.out.println("The smallest factor other than 1 for "
//                + n + " is " + factor);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0) continue;
            sum += i;

            System.out.println(i + " is " + sum);
        }

        int i = 0, sum2 = 0;
        while (i < 4) {
            if (i % 3 == 0) {
                i++;          // Fix: move i++ before continue
                continue;
            }
            sum2 += i;
            i++;


           System.out.println(i + " is " + sum2);
        }


    }

}
