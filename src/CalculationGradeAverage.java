import java.util.Scanner;

public class CalculationGradeAverage {
    public static void main(String[] args) {
        // definition of variable
        int math, physics, chemistry, turkish, history, music;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter your math grade: ");
        math = input.nextInt();

        System.out.print("Enter your physics grade: ");
        physics = input.nextInt();

        System.out.print("Enter your chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Enter your turkish grade: ");
        turkish = input.nextInt();

        System.out.print("Enter your history grade: ");
        history = input.nextInt();

        System.out.print("Enter your music grade: ");
        music = input.nextInt();

        // calculation grade average
        float average;
        average = (math + physics + chemistry + history + turkish + music) / 6.0f;
        System.out.println("Your Grade Average: " + average);

        // passed-failed condition
        String result = (average >= 60) ? "Passed" : "Failed";
        System.out.println(result);


    }
}
