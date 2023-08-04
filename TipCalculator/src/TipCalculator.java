public class TipCalculator {
    public static void main(String[] args) {

        int[] numbers = {2000, 4000, 6000};

        System.out.println((int) calculateTip(numbers, 25));
        System.out.println((int) calculateTip(numbers, 10));
        System.out.println((int) calculateTip(numbers, 7));
        System.out.println((int) calculateTip(numbers, 100));


    }

    static double calculateTip(int[] prices, int tipInPercentage) {

        int sumOfPrices = 0;

        for (int price : prices) {
            sumOfPrices += price;
        }

        if (tipInPercentage < 10 || tipInPercentage > 80) {
            return -1;
        }

        return sumOfPrices * ((double) tipInPercentage / 100);
    }
}
