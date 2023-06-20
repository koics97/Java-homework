import java.util.Scanner;

public class StrangePolynomialSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number");
        int num = scanner.nextInt();

        if (num < 1){
            System.out.println("Bye bye!");
            return;
        }

        int sumOfPolynoms = 0;
        for (int i = 1, n = 1; i <= num ; i++) {
            sumOfPolynoms += Math.pow(i,n++);
            if (n == 5){
                n = 1;
            }
        }
        System.out.println("The result of the polynomial sum is " + sumOfPolynoms);

    }
}
