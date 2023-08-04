import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TipCalculatorTest {

    @Test
    void testTipCalculator() {
        int[] numbers = {5000, 1000, 2000};
        Assertions.assertEquals(2000, TipCalculator.calculateTip(numbers, 25));
        Assertions.assertEquals(800, TipCalculator.calculateTip(numbers, 10));
        Assertions.assertEquals(-1, TipCalculator.calculateTip(numbers, 7));
        Assertions.assertEquals(-1, TipCalculator.calculateTip(numbers, 100));
    }

    @Test
    void testTipCalculator2(){
        int[] numbers = {2000, 250, 300, 50, 250};
        Assertions.assertEquals(570, TipCalculator.calculateTip(numbers, 20));
    }
}
