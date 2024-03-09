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
    private static final String[] THOUSANDS = {"trillion", "billion", "million", "thousand"};
    private static final long[] NUMBERS_TO_DIVIDE_WITH = {100_000_000_000_000L, 100_000_000_000L, 1_000_000, 1000};
    private static final String HYPHEN = "-";

    static String appendThousands(long number, String numberInEnglish, int iteration) {
        int hundreds = getHundreds(number, iteration);
        numberInEnglish += " " + ONE_TO_NINETEEN[hundreds] + " " + HUNDRED;
        number -= hundreds * NUMBERS_TO_DIVIDE_WITH[iteration];
        if (number < NUMBERS_TO_DIVIDE_WITH[iteration] / 100) {
            numberInEnglish += " " + THOUSANDS[iteration];
        }
        return numberInEnglish;
    }

    private static int getHundreds(long number, int iteration) {
        return (int) (number / NUMBERS_TO_DIVIDE_WITH[iteration]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        long number = scanner.nextLong();
        String numberInEnglish = "";
        // nine hundred ninety-nine billion nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine

        numberInEnglish = appendThousands(number, numberInEnglish, 0);
        System.out.printf("%d - %d = %d",
            number,
            getHundreds(number, 0) * NUMBERS_TO_DIVIDE_WITH[0],
            (number - getHundreds(number, 0) * NUMBERS_TO_DIVIDE_WITH[0]));
        number -= getHundreds(number, 0) * NUMBERS_TO_DIVIDE_WITH[0];
        //        number -= hundreds * NUMBERS_TO_DIVIDE_WITH[iteration - 1];
        if (number >= 1_000_000_000_000L) {
            int trillions = (int) (number / 1_000_000_000_000L);
            if (trillions >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[trillions / 10] + HYPHEN + ONE_TO_NINETEEN[trillions % 10] + " " + "trillion";
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[trillions] + " " + "trillion";
            }
            number -= trillions * 1_000_000_000_000L;
        }

        numberInEnglish = appendThousands(number, numberInEnglish, 1);
        number -= getHundreds(number, 1) * NUMBERS_TO_DIVIDE_WITH[1];


        if (number >= 1_000_000_000) {
            int billions = (int) (number / 1_000_000_000);
            if (billions >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[billions / 10] + HYPHEN + ONE_TO_NINETEEN[billions % 10] + " " + "billion";
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[billions] + " " + "billion";
            }
            number -= billions * 1_000_000_000L;
        }

        numberInEnglish = appendThousands(number, numberInEnglish, 2);
        number -= getHundreds(number, 2) * NUMBERS_TO_DIVIDE_WITH[2];


        if (number >= 1_000_000) {
            int millions = (int) (number / 1_000_000);

            if (millions >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[millions / 10] + HYPHEN + ONE_TO_NINETEEN[millions % 10] + " " + "million";
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[millions] + " " + "million";
            }
            number -= millions * 1_000_000L;
        }

        numberInEnglish = appendThousands(number, numberInEnglish, 3);
        number -= getHundreds(number, 3) * NUMBERS_TO_DIVIDE_WITH[3];

        if (number >= 1000) {
            int thousands = (int) (number / 1000);
            if (thousands >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[thousands / 10] + HYPHEN + ONE_TO_NINETEEN[thousands % 10] + " " + "thousand";
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[thousands] + " " + "thousand";
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