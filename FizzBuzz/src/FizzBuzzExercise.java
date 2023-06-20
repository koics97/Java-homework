import java.util.Scanner;

public class FizzBuzzExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();

        if(num < 1){
            do{
                System.out.println("Please enter a number greater than 0");
                num = scanner.nextInt();
            } while (num < 1);
        }

        for (int i = 1; i <= num ; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }

    }
}
