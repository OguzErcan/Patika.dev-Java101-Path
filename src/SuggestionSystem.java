import java.util.Scanner;

public class SuggestionSystem {
    public static void main(String[] args) {

        // definition of variables
        int temperature;

        // create an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting information from the user
        System.out.print("Enter the temperature : ");
        temperature = input.nextInt();

        // suggesting activity based on temperature
        if (temperature < 5) {
            System.out.println("Skiing");
        } else if (temperature <= 25) {
            if (temperature <= 15) {
                System.out.println("Cinema");
            }
            if (temperature >= 10) {
                System.out.println("Picnic");
            }
        } else {
            System.out.println("Swimming");
        }

    }
}
