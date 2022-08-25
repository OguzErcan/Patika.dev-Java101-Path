import java.util.Scanner;

public class CalculateHypo {
    public static void main(String[] args) {

        // definition of variable
        float firstEdge, secondEdge, hypo;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter the length of the first edge : ");
        firstEdge = input.nextFloat();
        System.out.print("Enter the length of the second edge : ");
        secondEdge = input.nextFloat();

        // calculation of hypotenuse
        hypo = (float) Math.sqrt((firstEdge * firstEdge) + (secondEdge * secondEdge));
        System.out.println(hypo);
    }
}
