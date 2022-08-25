import java.util.Scanner;

public class CalculationKdv {
    public static void main(String[] args) {
        // definition of variable
        float price, taxedPrice, taxAmount;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter the price : ");
        price = input.nextFloat();

        // calculations of taxed price and amount of tax
            // 0-1000 --> kdv = %18 ; >1000 --> kdv = %8
        System.out.println("Price : " + price);

        taxAmount = (price < 1000.0f) ? (price * 0.18f) : (price * 0.08f);
        System.out.println("Amount of Tax : " + taxAmount);

        taxedPrice = price + taxAmount;
        System.out.println("Taxed Price : " + taxedPrice);







    }
}
