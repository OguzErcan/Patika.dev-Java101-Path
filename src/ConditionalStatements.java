public class ConditionalStatements {
    public static void main(String[] args) {

        // IF-ELSE BLOKLARI

        int a = 10, b = 20;
        boolean compare = a == b;
        // String str = (compare) ? "Esittir" : "Esit Degildir";
        // System.out.println(str);

        if (compare) {
            System.out.println("Esittir");
        } else {
            System.out.println("Esit degildir");
        }

        int c = 5, d = 10, e = 12;

        if (c < d && c < e) {
            System.out.println("c en kucuk sayidir.");
        } else if (d < c && d < e) {
            System.out.println("d en kucuk sayidir.");
        } else {
            System.out.println("e en kucuk sayidir.");
        }


        // SWITCH-CASE YAPISI

        int day = 1;

        if (day == 1) {
            System.out.println("Bugün Pazartesi");
        } else if (day == 2) {
            System.out.println("Bugün Salı");
        } else if (day == 3) {
            System.out.println("Bugün Çarşamba");
        } else if (day == 4) {
            System.out.println("Bugün Perşembe");
        } else if (day == 5) {
            System.out.println("Bugün Cuma");
        } else if (day == 6) {
            System.out.println("Bugün Cumartesi");
        } else if (day == 7) {
            System.out.println("Bugün Pazar");
        }

        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Geçersiz");
        }

    }
}
