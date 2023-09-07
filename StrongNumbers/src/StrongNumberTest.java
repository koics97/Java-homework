import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrongNumberTest {
    @Test
    void testIsStrongNumber() {
        Assertions.assertTrue(StrongNumbers.isStrongNumber("145"));
        Assertions.assertTrue(StrongNumbers.isStrongNumber("1"));
        Assertions.assertTrue(StrongNumbers.isStrongNumber("2"));
    }

    @Test
    void testIsNotStrongNumber() {
        Assertions.assertFalse(StrongNumbers.isStrongNumber("22"));
        Assertions.assertFalse(StrongNumbers.isStrongNumber("555"));
        Assertions.assertFalse(StrongNumbers.isStrongNumber("756"));
    }

    @Test
    void testGetSumOfDigitsFactorial() {
        Assertions.assertEquals(145, StrongNumbers.getSumOfDigitsFactorial(new int[]{1, 4, 5}));
        Assertions.assertEquals(2, StrongNumbers.getSumOfDigitsFactorial(new int[]{2}));
        Assertions.assertEquals(1, StrongNumbers.getSumOfDigitsFactorial(new int[]{1}));
    }

    @Test
    void testGetSumOfDigitsFactorial2() {
        Assertions.assertNotEquals(22, StrongNumbers.getSumOfDigitsFactorial(new int[]{2, 2}));
        Assertions.assertNotEquals(555, StrongNumbers.getSumOfDigitsFactorial(new int[]{5, 5, 5}));
        Assertions.assertNotEquals(756, StrongNumbers.getSumOfDigitsFactorial(new int[]{7, 5, 6}));
    }

    @Test
    void testGetFactorial() {
        Assertions.assertEquals(2, StrongNumbers.getFactorial(2));
        Assertions.assertEquals(120, StrongNumbers.getFactorial(5));
        Assertions.assertEquals(24, StrongNumbers.getFactorial(4));
    }

    @Test
    void testGetDigitsOfNumber() {
        Assertions.assertArrayEquals(new int[]{1, 4, 5}, StrongNumbers.getDigitsOfNumber("145"));
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 8, 9}, StrongNumbers.getDigitsOfNumber("56789"));
        Assertions.assertArrayEquals(new int[]{2}, StrongNumbers.getDigitsOfNumber("2"));
    }
}
