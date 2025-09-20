package ChapterFourGreat;

public class PythagoreanTriples {
    public static void main(String[] args) {

//    for(int sideOne = 1; sideOne <= 500; sideOne++){
//        for(int sideTwo = 1; sideTwo <= 500; sideTwo++){
//            for(int sideThree = 1; sideThree <= 500; sideThree++){
//
//                sideOne = sideOne + sideTwo + sideThree;
//                sideTwo = sideTwo + sideThree + sideOne;
//                sideThree = sideThree + sideOne;
//
//                System.out.println(sideOne + " " + sideTwo + " " + sideThree);
//
//
//            }
//        }
//    }
                final int LIMIT = 500;

                System.out.printf("%-10s %-10s %-10s%n", "Side 1", "Side 2", "Hypotenuse");

                for (int side1 = 1; side1 <= LIMIT; side1++) {
                    for (int side2 = side1; side2 <= LIMIT; side2++)
                        for (int hypotenuse = side2; hypotenuse <= LIMIT; hypotenuse++) {
                            if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                                System.out.printf("%-10d %-10d %-10d%n", side1, side2, hypotenuse);
                            }
                        }
                    }
                }




    }

