package task1;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println("Give me a number and I will tell if it's an Armstrong number!");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        if(isArmstrongNumber(number)){
            System.out.println("It is an Armstrong number");
        } else{
            System.out.println("It is not an Armstrong number");
        }

        int sumOfArmstrongNumbers = 0;
        for(int i = 1; i <= 10000; i++){
            if(isArmstrongNumber(Integer.toString(i))){
                sumOfArmstrongNumbers += i;
            }
        }
        System.out.println("The sum of Armstrong numbers between 1 and 10_000 is " + sumOfArmstrongNumbers);

        int sumOfPrimeNumbers = 0;
        for (int i = 1; i <= 10000; i++){
            if(FirstTask.isPrime(i)){
                sumOfPrimeNumbers += i;
            }
        }
        System.out.println("The sum of prime numbers between 1 and 10_000 is " + sumOfPrimeNumbers);
        double divisionOfTheTwoSum = sumOfArmstrongNumbers / (double) sumOfPrimeNumbers;
        System.out.println(divisionOfTheTwoSum);
    }

    private static boolean isArmstrongNumber(String number) {
        int[] digitsOfNumber = getDigitsOfNumber(number);
        int nPowSumOfDigits = getNPowSum(digitsOfNumber, number.length());
        return nPowSumOfDigits == Integer.parseInt(number);
    }

    private static int getNPowSum(int[] digitsOfNumber, int n) {
        int sum = 0;
        for (int digit : digitsOfNumber) {
            sum += (int) Math.pow(digit, n);
        }
        return sum;
    }

    private static int[] getDigitsOfNumber(String number) {
        int[] digits = new int[number.length()];
        for(int i = 0; i < digits.length; i++){
            digits[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return digits;
    }
}
