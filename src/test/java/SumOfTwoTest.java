import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoTest {
    SumOfTwo sumOfTwo;

    @BeforeEach
    void setUp() {
        sumOfTwo = new SumOfTwo();
    }

    @Test
    void testSumOfTwoAlgoritm12() {
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;

        int[][] expectedResult = {{3, 9}, {7, 5}};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgoritm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testSumOfTwoAlgoritm5() {
        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 5;

        int[][] expectedResult = {{3, 2}};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgoritm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}