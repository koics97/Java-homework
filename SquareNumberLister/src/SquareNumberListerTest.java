import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareNumberListerTest {

    @Test
    void testGetSquareNumber(){
        Assertions.assertEquals(4,SquareNumberLister.getSquareNumber(2));
        Assertions.assertEquals(64, SquareNumberLister.getSquareNumber(8));
    }

    @Test
    void  testIsNumberValid(){
        Assertions.assertTrue(SquareNumberLister.isValid(2));
        Assertions.assertTrue(SquareNumberLister.isValid(2_000_000_000));
        Assertions.assertTrue(SquareNumberLister.isValid(1_563_154_023));
    }

    @Test
    void testIsNumberNotValid(){
        Assertions.assertFalse(SquareNumberLister.isValid(1));
        Assertions.assertFalse(SquareNumberLister.isValid(-1));
        Assertions.assertFalse(SquareNumberLister.isValid(2_000_000_001));
    }
}
