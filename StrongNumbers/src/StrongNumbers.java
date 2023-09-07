import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number and I will tell you whether it is a strong number or not!");
        String number = scanner.nextLine();

        if (isStrongNumber(number)) {
            System.out.println("It is a strong number");
        } else {
            System.out.println("It is not a strong number");
        }
    }

    static boolean isStrongNumber(String number) {
        int[] digitsOfNumber = getDigitsOfNumber(number);
        int sumOfDigitsFactorial = getSumOfDigitsFactorial(digitsOfNumber);
        return sumOfDigitsFactorial == Integer.parseInt(number);
    }

    static int getSumOfDigitsFactorial(int[] digitsOfNumber) {
        int sum = 0;
        for (int digit : digitsOfNumber) {
            sum += getFactorial(digit);
        }
        return sum;
    }

    static int getFactorial(int number) {
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    static int[] getDigitsOfNumber(String number) {
        int[] digits = new int[number.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return digits;
    }
}
