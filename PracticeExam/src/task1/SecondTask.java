package task1;

public class SecondTask {
    public static void main(String[] args) {
        int[] numbers = new int[25000];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        System.out.println("Good! Let's get started!");

        int[] primeNumbers = new int[1000];
        int k = 0;
        for(int i = 2; i < numbers.length; i++){
            if(numbers[i] == 0){
                continue;
            }
            primeNumbers[k] = numbers[i];
            k++;
            for(int j = i; j < numbers.length; j += i){
                numbers[j] = 0;
            }
            if(k == primeNumbers.length){
                break;
            }
        }

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }
    }
}
