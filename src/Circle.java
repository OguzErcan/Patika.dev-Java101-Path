import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        // definition of variable
        float radius, circumference, area, centralAngle, circleSegment;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter the radius of circle : ");
        radius = input.nextFloat();
        System.out.print("Enter the measure of the central angle : ");
        centralAngle = input.nextFloat();

        // calculation
        circumference = 2.0f * 3.14f * radius;
        System.out.println("Circumference of the circle : " + circumference);

        area = 3.14f * (radius*radius);
        System.out.println("Area of the circle : " + area);

        circleSegment = (3.14f * (radius*radius) * centralAngle) / 360.0f;
        System.out.println("Area of the segment of the circle : " + circleSegment);

    }
}
