import java.util.Scanner;

public class HeavenlyNumbers {

    static int amountOfDivisibleNumbers(int number){

        int numOfDivisibleNumbers = 0;

        for (int i = 1; i <= number ; i++) {
            if (number % i == 0){
                numOfDivisibleNumbers++;
            }
        }
        return numOfDivisibleNumbers;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        int num = scanner.nextInt();

        String heavenlyNumber = "The given number is a heavenly number!";
        String notHeavenlyNumber = "The given number is NOT a heavenly number!";

        if (num < 100){
            if(num % 2 == 0 && num % 7 != 0){
                System.out.println(heavenlyNumber);
            }else {
                System.out.println(notHeavenlyNumber);
            }
        }else if (num > 300){
            if ((num % 13 == 0) && (amountOfDivisibleNumbers(num) > 8)){
                System.out.println(heavenlyNumber);
            }else {
                System.out.println(notHeavenlyNumber);
            }
        }else {
            System.out.println(notHeavenlyNumber);
        }

        scanner.close();

    }
}
