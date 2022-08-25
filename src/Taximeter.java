import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        // definition of variable
        float distance, fee, feePerKm = 2.2f;
        int startingFee = 10, minFee =20;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter the distance (km) : ");
        distance = input.nextFloat();

        // calculation
        fee = startingFee + (distance * feePerKm);

        fee = (fee < minFee) ? minFee : (fee);
        System.out.println("Amount to be paid : " + fee);


    }
}
