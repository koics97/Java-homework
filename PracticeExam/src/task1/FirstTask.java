package task1;

public class FirstTask {
    public static void main(String[] args) {
        boolean hasFirstPrime = false;
        int counter = 0;
        int sum = 0;
        for (int i = 16555; i > 1; i--) {
            if (isPrime(i) && !hasFirstPrime) {
                System.out.println("The first prime is: " + i);
                hasFirstPrime = true;
            } else if (isPrime(i)) {
                if (counter != 3) {
                    counter++;
                } else {
                    System.out.print(i + " ");
                    counter = 0;
                }
                if (i >= 4000 && i <= 7935) {
                    sum += i;
                }
            }
        }
        System.out.println("\nThe sum of the prime numbers between 4000 and 7935 is: " + sum);
        if (isPrime(sum)) {
            System.out.println("The sum is a prime");
        }
        if (isSquareNumber(sum)) {
            System.out.println("The sum is a square number");
        } else {
            printNextPrimes(sum);
            printNextSquareNumbers(sum);
        }
    }

    private static void printNextSquareNumbers(int number) {
        System.out.println("The closest square numbers to the sum are: ");
        for (int i = number; ; i--) {
            if(isSquareNumber(i)){
                System.out.println(i);
                break;
            }
        }
        for (int i = number; ; i++) {
            if(isSquareNumber(i)){
                System.out.println(i);
                break;
            }
        }
    }

    private static void printNextPrimes(int number) {
        System.out.println("The closest primes to the sum are: ");
        for (int i = number; ; i--) {
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
        }
        for (int i = number; ; i++) {
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        if(number == 1){
            return false;
        }
        return true;
    }

    private static boolean isSquareNumber(int number) {
        int sqrtOfNumber = (int) Math.sqrt(number);
        return sqrtOfNumber * sqrtOfNumber == number;
    }
}
