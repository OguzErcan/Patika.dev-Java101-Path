import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {

        // definition of variables
        int month, day;
        String horoscope = "";
        boolean isError = false;

        // create an object named "input" from Scanner class
        Scanner input = new Scanner(System.in);

        // getting date of birth information from the user
        System.out.print("Enter the month you were born : ");
        month = input.nextInt();
        System.out.print("Enter the day you were born : ");
        day = input.nextInt();

        /*
        Aries : 21 March - 20 April
        Taurus : 21 April - 21 May
        Gemini : 22 May - 22 June
        Cancer : 23 June - 22 July
        Leo : 23 July - 22 August
        Virgo : 23 August - 22 September
        Libra : 23 September - 22 October
        Scorpio : 23 October - 21 November
        Sagittarius : 22 November - 21 December
        Capricorn : 22 December - 21 January
        Aquarius : 22 January - 19 February
        Pisces : 20 February - 20 March
         */

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        horoscope = "Aquarius";
                    } else {
                        horoscope = "Pisces";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        horoscope = "Aries";
                    } else {
                        horoscope = "Taurus";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Taurus";
                    } else {
                        horoscope ="Gemini";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Gemini";
                    } else {
                        horoscope = "Cancer";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Cancer";
                    } else {
                        horoscope = "Leo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Leo";
                    } else {
                        horoscope = "Virgo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        horoscope = "Virgo";
                    } else {
                        horoscope = "Libra";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Scorpio";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        horoscope = "Scorpio";
                    } else {
                        horoscope = "Sagittarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        horoscope = "Sagittarius";
                    } else {
                        horoscope = "Capricorn";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.println("You have entered incorrectly. Try again.");
        } else {
            System.out.println("Your horoscope : " + horoscope);
        }

    }
}
