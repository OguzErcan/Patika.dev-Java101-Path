import java.util.Scanner;

public class SimpleSorting {
    public static void main(String[] args) {

        // definition of variables
        int num1, num2, num3;

        // create an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting numbers from the user
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        // Sorting of entered three numbers
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + "<" + num2 + "<" + num3);
            } else {
                System.out.println(num1 + "<" + num3 + "<" + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + "<" + num1 + "<" + num3);
            } else {
                System.out.println(num2 + "<" + num3 + "<" + num1);
            }
        } else {
            if (num1 < num2) {
                System.out.println(num3 + "<" + num1 + "<" + num2);
            } else {
                System.out.println(num3 + "<" + num2 + "<" + num1);
            }
        }

    }
}
