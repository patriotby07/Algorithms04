import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOccurrencesTest {
    NumberOccurrences numberOccurrences;

    @BeforeEach
    void setUp() {
        numberOccurrences = new NumberOccurrences();
    }

    @Test
    void testNumberOccurrencesAlgoritm() {
        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};

        int[][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        int[][] actualResult = numberOccurrences.numberOccurrencesAlgoritm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}