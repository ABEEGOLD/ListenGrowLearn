package ChapterFourGreat;

public class ValueOfPi {
        public static void main(String[] args) {
            double pi = 0.0;
            int firstMatchTerm = -1;
            String target = "3.14159";

            for (int i = 0; i < 200000; i++) {
                double term = 1.0 / (2 * i + 1);
                if (i % 2 == 0) {
                    pi += term;
                } else {
                    pi -= term;
                }

                double piApprox = 4 * pi;


                if (i < 10) {
                    System.out.printf("Term %d: %.6f\n", i + 1, piApprox);
                }


                if (firstMatchTerm == -1 && String.format("%.6f", piApprox).startsWith(target)) {
                    firstMatchTerm = i + 1;
                }
            }

            System.out.println("\nπ first starts with 3.14159 at term: " + firstMatchTerm);
        }
}


