import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        // definition of variable
        String userName, password, answer, newPassword;

        // create an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting information from the user
        System.out.print("User Name : ");
        userName = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        // checking for matching -- username: patika ; password: java123
        if (userName.equals("patika")) {
            if (password.equals("java123")) {
                System.out.println("Login successful");
            } else {
                System.out.print("Would you like to reset your password? (y/n) : ");
                answer = input.nextLine();
                if (answer.equals("y")) {
                    System.out.print("Enter your new password : ");
                    newPassword = input.nextLine();
                    System.out.println(
                            (newPassword.equals("java123")) ? ("Could not create password, please enter another password.") : ("Password created."));
                } else {
                    System.out.println("Restart the program.");
                }
            }
        } else {
            System.out.println("Wrong User Name");
        }


    }
}
