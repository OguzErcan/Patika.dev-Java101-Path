import java.util.Scanner;

public class CashRegister {
    public static void main(String[] args) {

        // definition of variable
            // prices of products
        float pear = 2.14f, apple = 3.37f, tomato = 1.11f, banana = 0.95f, aubergine = 5.0f;
            // amount of products
        int amtPear, amtApple, amtTomato, amtBanana, amtAubergine;
            // amount to be paid
        float totalFee;

        // deriving an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting data from users
        System.out.print("Enter the amount of pears you bought : ");
        amtPear = input.nextInt();
        System.out.print("Enter the amount of apples you bought : ");
        amtApple = input.nextInt();
        System.out.print("Enter the amount of tomatoes you bought : ");
        amtTomato = input.nextInt();
        System.out.print("Enter the amount of bananas you bought : ");
        amtBanana = input.nextInt();
        System.out.print("Enter the amount of aubergines you bought : ");
        amtAubergine = input.nextInt();

        // calculation of the amount to be paid
        totalFee = (pear * amtPear) + (banana * amtBanana) + (apple * amtApple) + (tomato * amtTomato) + (aubergine * amtAubergine);
        System.out.println("Amount you have to pay : " + totalFee);
    }
}
