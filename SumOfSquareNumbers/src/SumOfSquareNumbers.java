import java.util.Scanner;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer between 1 and 500!!");
        int number = scanner.nextInt();

        if (number < 1 || number > 500) {
            System.out.println("Bye bye!");
        } else {
            int sumOfTheSquareNumbers = 0;

            for (int i = 1; i <= number ; i++) {
                sumOfTheSquareNumbers += Math.pow(i , 2);
            }

            System.out.println("The sum of the square numbers are " + sumOfTheSquareNumbers);

            scanner.close();

        }
    }
}
