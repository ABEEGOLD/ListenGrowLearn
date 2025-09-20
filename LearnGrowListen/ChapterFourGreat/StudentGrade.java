package ChapterFourGreat;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gradeCount = 1;
        int totalGrade = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        String name = "";
        String letterGrade = "A";


        while(true) {
            System.out.print("Enter student name(quit with 0): ");
             name = input.next();
            if (name.equals("0")) {
                break;
            }
            System.out.print("Enter student Grade(quit with 0): ");
            int grade = input.nextInt();
            if (grade == 0) {
                break;
            }
            totalGrade += grade;
            ++gradeCount;


            switch (grade / 10) {
                case 10:
                case 9:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
            }


            letterGrade = switch (letterGrade) {
                case "A" -> "A";
                case "B" -> "B";
                case "C" -> "C";
                case "D" -> "D";
                default -> "F";
            };
        }


        System.out.printf("%nGrade Report:%n");
        System.out.println("The student total grades:"+ totalGrade + "\tand grade count is:" +gradeCount);

        System.out.println("A Student are!: " + aCount);
        System.out.println("B Student are!: " + bCount);
        System.out.println("C Student are!: " + cCount);
        System.out.println("D Student are!: " + dCount);
        System.out.println("F Student are!: " + fCount);

        System.out.println("Student name:"+ name + "Student Grade letter " + letterGrade);
        System.out.println("Student name:"+ name + "Student Grade letter " + letterGrade);
        System.out.println("Student name:"+ name + "Student Grade letter " + letterGrade);
        System.out.println("Student name:"+ name + "Student Grade letter " + letterGrade);
        System.out.println("Student name:"+ name + "Student Grade letter " + letterGrade);

    }

}
