package ChapterFourGreat.CheckWork.W3School;

public class ConditionalStatement {
    public static void main(String[] args) {
        boolean isRaining = true;

            if (isRaining) {
                System.out.println("Bring an umbrella!");
            }



            if (20 > 18) {
                System.out.println("20 is greater than 18");
            }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
         }


        boolean isLightOn = true;

        if (isLightOn) {   //if (isLightOn == true)  it can be written this way.
            System.out.println("The light is on.");
        }


        boolean isLightOnR = false;

        if (isLightOnR) {
            System.out.println("The light is on.");  // This will not be printed
        }

        System.out.println("This line runs no matter what, because it is outside the if statement.");


        if (20 > 18)
            System.out.println("20 is greater than 18");


        boolean isRainingS = false;

        if (isRainingS) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("No rain today, no need for an umbrella!");
        }


        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
            System.out.println("Bring an umbrella.");
        } else if (weather == 2) {
            System.out.println("Wear sunglasses.");
        } else {
            System.out.println("Just go outside normally.");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int timeW = 20;
        String result = (timeW < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }

        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }

        int aB = 200;
        int bC = 33;
        int cE = 500;

        if (aB > bC || aB > cE) {
            System.out.println("At least one condition is true");
        }
        int aA = 33;
        int bB = 200;

        if (!(aA > bB)) {
            System.out.println("a is NOT greater than b");
        }

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        int myNumB = 5;

        if (myNumB % 2 == 0) {
            System.out.println(myNumB + " is even");
        } else {
            System.out.println(myNumB + " is odd");
        }

        int temperature = 30;

        if (temperature < 0) {
            System.out.println("It's freezing!");
        } else if (temperature < 20) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's warm.");
        }


        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");
    }
    }