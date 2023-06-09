import java.util.Scanner;

public class FactorialWithDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a positive integer and I will give you the factorial of it!");
        int number = scanner.nextInt();

        long factorialOfNumber = 1;
        int i = 2;

        do {
            factorialOfNumber *= i++;
        } while  (i <= number);

        System.out.println("The factorial of your number is " + factorialOfNumber);

        scanner.close();

    }
}
