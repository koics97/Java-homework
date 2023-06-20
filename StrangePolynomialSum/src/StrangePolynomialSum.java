import java.util.Scanner;

public class StrangePolynomialSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number");
        int num = scanner.nextInt();

        if(num < 1){
            System.out.println("Bye bye!");
            return;
        }

        int sumOfThePolynomials = 0;
        for (int i = 1, n = 1; i <= num ; i++) {
            sumOfThePolynomials += Math.pow(i,n++);
            if(n == 5){
                n = 1;
            }
        }
        System.out.println("The result of the sum of the polynomials is: " + sumOfThePolynomials);

        scanner.close();

    }
}
