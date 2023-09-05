import java.util.Scanner;

public class Calculator {
   private static final String giveTwoNumbers = "Please type two numbers";
   private static final String giveANumber = "Please type a number";
    public static void main(String[] args) {
        System.out.println("What do you wanna do: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modular division");
        System.out.println("6 - Power");
        System.out.println("7 - Percentage");
        System.out.println("8 - Factorial");
        System.out.println("9 - Square root");

        Scanner scanner = new Scanner(System.in);
        int number = getNumber(scanner);
        switch (number) {
            case 1:
                performAddition(scanner);
                break;
            case 2:
                performSubtraction(scanner);
                break;
            case 3:
                performMultiplication(scanner);
                break;
            case 4:
                performDivision(scanner);
                break;
            case 5:
                performModularDivision(scanner);
                break;
            case 6:
                performPower(scanner);
                break;
            case 7:
                performPercentageCalculation(scanner);
                break;
            case 8:
                performFactorialCalculation(scanner);
                break;
            case 9:
                performSquareRoot(scanner);
                break;
        }
        scanner.close();
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.println(giveANumber);
        int num = getNumber(scanner);
        System.out.println(sqrt(num));
    }

    static double sqrt(double num) {
        return Math.sqrt(num);
    }

    private static void performPercentageCalculation(Scanner scanner) {
        System.out.println(giveTwoNumbers);
        int num1 = getNumber(scanner);
        int num2 = getNumber(scanner);
        System.out.println(getPercentage(num1,num2));
    }

    static double getPercentage(double num1, double num2) {
        return num1 / 100 * num2;
    }

    private static void performPower(Scanner scanner) {
        System.out.println(giveTwoNumbers);
        int num1 = getNumber(scanner);
        int num2 = getNumber(scanner);
        System.out.println(pow(num1,num2));
    }

    static int pow(int num1, int num2) {
        return (int) Math.pow(num1,num2);
    }

    private static void performModularDivision(Scanner scanner) {
        System.out.println(giveTwoNumbers);
        int num1 = getNumber(scanner);
        int num2 = getNumber(scanner);
        System.out.println(mod(num1,num2));
    }

    static int mod(int num1, int num2) {
        return num1 % num2;
    }

    private static void performDivision(Scanner scanner) {
        System.out.println(giveTwoNumbers);
        int num1 = getNumber(scanner);
        int num2 = getNumber(scanner);
        System.out.println(divide(num1,num2));
    }

    static double divide(double num1, double num2) {
        return num1 / num2;
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.println(giveTwoNumbers);
        int num1 = getNumber(scanner);
        int num2 = getNumber(scanner);
        System.out.println(product(num1,num2));
    }

    static int product(int num1, int num2) {
        return num1 * num2;
    }

    private static void performFactorialCalculation(Scanner scanner) {
        System.out.println(giveANumber);
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }

    static long factorial(int num) {
        //2! = 1*2
        //5! = 1*2*3*4*5
        long factorial = 1;

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.println("Please type two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(difference(num1, num2));
    }

    static int difference(int num1, int num2) {
        return num1 - num2;
    }

    private static void performAddition(Scanner scanner) {
        System.out.println(giveTwoNumbers);
        int num1 = getNumber(scanner);
        int num2 = getNumber(scanner);
        System.out.println(sum(num1, num2));
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    private static int getNumber(Scanner scanner) {
        return scanner.nextInt();
    }
}

