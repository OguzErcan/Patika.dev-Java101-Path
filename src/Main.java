import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java101 Path");
        System.out.println("We are starting");
        System.out.println("Java101 Path\nWe are starting");

        // tek yorum satırı

        /*
        coklu
        yorum
        satırı
         */

        // Javadoc

        /**
         * @author Oguz Ercan, 2022
         */

        // degisken atama - veri tipleri

        int number1 = 10;
        System.out.println(number1);

        // degiskenlerin degerleri degistirilebilir

        number1 = 5;

        int number2, number3, number4 = 3, number5;
        number2 = 20;

        System.out.println(number4);

        number5 = number2 + number1;
        System.out.println(number5);

        int number6 = number1 + number4;
        System.out.println(number6);

        /*
        TAM SAYILAR
            byte --> -128 - 127 ; 8 bit
            short --> 16 bit uzunluğundadır. Max 32,767 , Min -32,768 değerleri arasındadır.
            integer (int) --> 32 bit uzunluğundadır. Max 2,147,483,647 , Min -2,147,483,648 değerleri arasındadır.
            long --> 64 bit uzunluğundadır. Max 9,223,372,036,854,775,807 , Min -9,223,372,036,854,775,808 değerleri arasındadır.
        ONDALIKLI SAYILAR
            float --> 32 Bit boyutundadır ve 1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
                         float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
            double --> 64 Bit boyutundadır ve 4.9×10^-324 ile 1.8×10^308 aralığında bir değer tanımlanabilir.
        KARAKTER
            char --> 16 bittir. Unicode karakter setini kullanır.
                        Char veri tipleri birleşerek String Sınıfından bir yapıya dönüşür.
                        tek tırnak kullanılarak tanımlanmalı
        BOOLEAN
            true (1), false (0)
         */

        // STRING SINIFI

        // java.lang kütüphanelerinde bulunan ve metinlerle ilgili her türlü işlemin yapıldığı sınıftır.

        String name = "Oguz Ercan";

        /*
        TEMEL OPERATORLER
            Atama Operatorleri --> = , += , -= , *= , /= , %=
            Aritmatiksel Operatorler --> + , - , * , / , % , ++ , --
            Karşılaştırma Operatörleri --> == , != , > , < , >= , <=
            Mantıksal Operatorler --> && , || , !
            Koşul Operatorleri --> ? , :

         */

        // KULLANICIDAN VERİ ALMA

        // Scanner sınıfı kullanılır.
        // Sınıfın koda dahil edilmesi --> import ; kodun başına yazılır

        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        a = input.nextInt();
        System.out.println(a);

        System.out.print("Bir deger giriniz: ");
        double b = input.nextDouble();
        System.out.println(b);

        // NOT ORTALAMASI HESAPLAMA UYGULAMASI




    }
}
