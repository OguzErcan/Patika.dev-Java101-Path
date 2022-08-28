import java.util.Scanner;

public class CalculationGradeAverage2 {
    public static void main(String[] args) {

        // definition of variables
        int math, physics, chemistry, turkish, history, music;
        int totalGrade = 0, numberOfLessons = 0;
        float average;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from user
        System.out.print("Enter your math grade: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            totalGrade += math;
            numberOfLessons++;
        }

        System.out.print("Enter your physics grade: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            totalGrade += physics;
            numberOfLessons++;
        }

        System.out.print("Enter your chemistry grade: ");
        chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            totalGrade += chemistry;
            numberOfLessons++;
        }

        System.out.print("Enter your turkish grade: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            totalGrade += turkish;
            numberOfLessons++;
        }

        System.out.print("Enter your history grade: ");
        history = input.nextInt();
        if (history >= 0 && history <= 100) {
            totalGrade += history;
            numberOfLessons++;
        }

        System.out.print("Enter your music grade: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            totalGrade += music;
            numberOfLessons++;
        }

        if (numberOfLessons == 0) {
            System.out.println("The grade entered must be between 0 and 100");
        } else {
            average = totalGrade / numberOfLessons;
            System.out.println("Your Grade Average: " + average);
            System.out.println((average < 55) ? "Failed" : "Passed");
        }

    }
}
