import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testFactorial() {
        Assertions.assertEquals(120, Calculator.factorial(5));
    }
    @Test
    void testSquareRoot(){
        Assertions.assertEquals(3,Calculator.sqrt(9));
    }
    @Test
    void testAddition(){
        Assertions.assertEquals(6,Calculator.sum(3,3));
    }
    @Test
    void testSubtraction(){
        Assertions.assertEquals(3,Calculator.difference(6,3));
    }
    @Test
    void testMultiplication(){
        Assertions.assertEquals(9,Calculator.product(3,3));
    }
    @Test
    void testDivision(){
        Assertions.assertEquals(2,Calculator.divide(6,3));
    }
    @Test
    void testModularDivision(){
        Assertions.assertEquals(1,Calculator.mod(5,2));
    }
    @Test
    void testPower(){
        Assertions.assertEquals(128,Calculator.pow(2,7));
    }
    @Test
    void testPercentageCalculation(){
        Assertions.assertEquals(25,Calculator.getPercentage(50,50));
    }
}
