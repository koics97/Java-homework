import java.util.Scanner;

public class NumberConverter {

    //input: egy szám 1 és 999 között
    //output: az angol kiírása a számnak
    //  1 --> one
    // 10 --> ten
    // 52 --> fifty-two
    // 101 --> one hundred one
    // 119 --> one hundred nineteen
    // 115 --> one hundred fifteen
    // 125 --> one hundred twenty-five
    // 220 --> two hundred twenty

    private static final String[] ONE_TO_NINETEEN = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TWENTY_TO_NINETY = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String HUNDRED = "hundred";
    private static final String THOUSAND = "thousand";
    private static final String MILLION = "million";
    private static final String BILLION = "billion";
    private static final String TRILLION = "trillion";
    private static final String HYPHEN = "-";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        long number = scanner.nextLong();
        String numberInEnglish = "";
        // nine hundred ninety-nine billion nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine

        if (number >= 100_000_000_000_000L){
            int hundredtrillions = (int) (number / 100_000_000_000_000L);
            numberInEnglish += " " + ONE_TO_NINETEEN[hundredtrillions] + " " + HUNDRED;
            number -= hundredtrillions * 100_000_000_000_000L;
            if (number < 1_000_000_000_000L){
                numberInEnglish += " " + TRILLION;
            }
        }

        if (number >=1_000_000_000_000L){
            int trillions = (int) (number / 1_000_000_000_000L);
            if (trillions >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[trillions / 10] + HYPHEN + ONE_TO_NINETEEN[trillions % 10] + " " + TRILLION;
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[trillions] + " " + TRILLION;
            }
            number -= trillions * 1_000_000_000_000L;
        }

        if (number >= 100_000_000_000L) {
            int hundredbillions = (int) (number / 100_000_000_000L);
            numberInEnglish += " " + ONE_TO_NINETEEN[hundredbillions] + " " + HUNDRED;
            number -= hundredbillions * 100_000_000_000L;
            if (number < 1000_000_000) {
                numberInEnglish += " " + BILLION;
            }
        }

        if (number >= 1_000_000_000) {
            int billions = (int) (number / 1_000_000_000);
            if (billions >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[billions / 10] + HYPHEN + ONE_TO_NINETEEN[billions % 10] + " " + BILLION;
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[billions] + " " + BILLION;
            }
            number -= billions * 1_000_000_000L;
        }

        if (number >= 100_000_000) {
            int hundredmillions = (int) (number / 100_000_000);
            numberInEnglish += " " + ONE_TO_NINETEEN[hundredmillions] + " " + HUNDRED;
            number -= hundredmillions * 100_000_000;
            if (number < 1_000_000) {
                numberInEnglish += " " + MILLION;
            }
        }

        if (number >= 1_000_000) {
            int millions = (int) (number / 1_000_000);

            if (millions >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[millions / 10] + HYPHEN + ONE_TO_NINETEEN[millions % 10] + " " + MILLION;
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[millions] + " " + MILLION;
            }
            number -= millions * 1_000_000L;
        }

        if (number >= 100_000) {
            int hundredthousands = (int) (number / 100_000);
            numberInEnglish += " " + ONE_TO_NINETEEN[hundredthousands] + " " + HUNDRED;
            number -= hundredthousands * 100_000;
            if (number < 1000) {
                numberInEnglish += " " + THOUSAND;
            }
        }

        if (number >= 1000) {
            int thousands = (int) (number / 1000);
            if (thousands >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[thousands / 10] + HYPHEN + ONE_TO_NINETEEN[thousands % 10] + " " + THOUSAND;
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[thousands] + " " + THOUSAND;
            }
            number -= thousands * 1000L;
        }

        if (number >= 100) {
            int hundreds = (int) (number / 100); //number = 245 --> hundreds = 2
            numberInEnglish += " " + ONE_TO_NINETEEN[hundreds] + " " + HUNDRED;
            number -= hundreds * 100; // 245 --> 45
        }

        if (number >= 20) {
            numberInEnglish += " " + TWENTY_TO_NINETY[(int) (number / 10)];
            number %= 10;
            numberInEnglish += HYPHEN + ONE_TO_NINETEEN[(int) number];
        } else {
            numberInEnglish += " " + ONE_TO_NINETEEN[(int) number];
        }

        System.out.println(numberInEnglish);
        scanner.close();
    }
}