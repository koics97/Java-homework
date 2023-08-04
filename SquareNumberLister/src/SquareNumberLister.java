
import java.util.Scanner;

public class SquareNumberLister {
    public static void main(String[] args) {
        System.out.println("Please give a number between 2 and 2_000_000_000");
        Scanner scanner = new Scanner(System.in);
        int number = getNumberFromUser(scanner);

        listSquareNumbers(number);

    }

    static void listSquareNumbers(int number) {
        for (int i = 1; getSquareNumber(i) < number; i++) {
            System.out.println(getSquareNumber(i));
        }
    }

    static int getNumberFromUser(Scanner scanner) {
        int number;
        boolean isValid;
        do {
            number = scanner.nextInt();
            isValid = isValid(number);
        } while (!isValid);
        return number;
    }

    static boolean isValid(int number) {
        return number >= 2 && number <= 2_000_000_000;
    }


    static int getSquareNumber(int number) {
        return number * number;
    }
}
