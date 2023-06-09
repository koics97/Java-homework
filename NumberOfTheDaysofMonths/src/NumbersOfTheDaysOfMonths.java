import java.util.Scanner;

public class NumbersOfTheDaysOfMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer between 1 and 12 and I tell you which month has 30 or 31 days!");
        int month = scanner.nextInt();

        if (month < 1 || month > 12){
            System.err.println("Wrong value! Bye bye!");
        } else {
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("The given month has 31 days.");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("The given month has 30 days.");
                    break;
                default:
                    System.out.println("The given month has 28 or 29 days. Depends on the year");
                    break;
            }
        }


    }
}
