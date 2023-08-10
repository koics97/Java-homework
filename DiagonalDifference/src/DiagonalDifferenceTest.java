import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class DiagonalDifferenceTest {
    @Test
    void testGetDiagonalDifference(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Assertions.assertEquals(0,DiagonalDifference.getDiagonalDifference(matrix));

    }

    @Test
    void testGetDiagonalDifference2(){
        int[][] matrix = {{1, 2, 3, 4, 7}, {5, 5, 5, 5, 2}, {1, 1, 0, 0, 0}, {0, 2, 3, 4, 1}, {0, 1, 1, 2, 2}};
        Assertions.assertEquals(-2,DiagonalDifference.getDiagonalDifference(matrix));
    }
}
