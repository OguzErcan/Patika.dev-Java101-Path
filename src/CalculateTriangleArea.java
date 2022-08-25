import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {

        // definition of variable
        float firstEdge, secondEdge, thirdEdge, area, semiperimeter;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter the length of the first edge : ");
        firstEdge = input.nextFloat();
        System.out.print("Enter the length of the second edge : ");
        secondEdge = input.nextFloat();
        System.out.print("Enter the length of the third edge : ");
        thirdEdge = input.nextFloat();

        // calculation of area
        semiperimeter = (firstEdge + secondEdge + thirdEdge) / 2.0f;
        area = (float) Math.sqrt(semiperimeter * (semiperimeter - firstEdge) * (semiperimeter - secondEdge) * (semiperimeter - thirdEdge));
        System.out.println("The area of the triangle : " + area);

    }
}
