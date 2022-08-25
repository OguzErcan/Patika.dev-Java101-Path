import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        // definition of variable
        float height, weight, bmi;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter your height in meters : ");
        height = input.nextFloat();

        System.out.print("Enter your weight : ");
        weight = input.nextFloat();

        // calculation of body mass index
        bmi = weight / (height*height);
        System.out.println("Your body mass index : " + bmi);
    }
}
