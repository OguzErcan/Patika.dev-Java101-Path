import java.util.Scanner;

public class SimpleCalculator2 {
    public static void main(String[] args) {

        // definition of variable
        int num1, num2, selection;

        // create an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting the numbers to be processed from the user
        System.out.print("Enter the first number : ");
        num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        num2 = input.nextInt();

        // getting the information about which operation will be applied from the user
        System.out.print(
                """
                        Select the operation to be applied
                        ---------------
                        Press 1 for (+)
                        Press 2 for (-)
                        Press 3 for (*)
                        Press 4 for (/)
                        ---------------
                        Your selection :\s"""
        );
        selection = input.nextInt();

        // calculation
        switch (selection) {
            case 1:
                System.out.println("Result : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result : " + (num1 * num2));
                break;
            case 4:
                System.out.println(
                        num2 == 0 ? ("A number cannot be divided by zero.") : ("Result : " + (num1 / num2)));
                break;
            default:
                System.out.println("You have not made a valid selection. Try again.");
        }

    }
}
