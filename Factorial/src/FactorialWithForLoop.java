import java.util.Scanner;

public class FactorialWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a positive integer and I will give you the factorial of it!");
        int number = scanner.nextInt();

        long factorialOfNumber = 1;

        for (int i = 2; i <= number ; i++) {
            factorialOfNumber *= i;
        }

        System.out.println("The factorial of your number is " + factorialOfNumber);

    }
}
