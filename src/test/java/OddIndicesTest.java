import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddIndicesTest {
    OddIndices oddIndices;

    @BeforeEach
    void setUp() {
        oddIndices = new OddIndices();
    }

    @Test
    void testOddIndicesHappyPathArrayEven() {
        int[] result = {-45, 590, 234, 985, 12, 68};
        int[]expectedResult = {590, 985, 68};

        int[] actualResult = oddIndices.oddIndices(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testOddIndicesHappyPathZero() {
        int[] result = {0};
        int[]expectedResult = {};

        int[] actualResult = oddIndices.oddIndices(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testOddIndicesHappyPathOneNumber() {
        int[] result = {20};
        int[]expectedResult = {};

        int[] actualResult = oddIndices.oddIndices(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testOddIndicesHappyPathArrayEmpty() {
        int[] result = {};
        int[]expectedResult = {};

        int[] actualResult = oddIndices.oddIndices(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testOddIndicesHappyPathArrayNull() {
        int[] result = null;
        int[]expectedResult = {};

        int[] actualResult = oddIndices.oddIndices(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testOddIndicesHappyPathArrayOdd() {
        int[] result = {-45, 590, 234};
        int[]expectedResult = {590};

        int[] actualResult = oddIndices.oddIndices(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testOddIndicesHappyPathMaxMinValue() {
        int[] result = {Integer.MAX_VALUE, Integer.MIN_VALUE, 234};
        int[]expectedResult = {Integer.MIN_VALUE};

        int[] actualResult = oddIndices.oddIndices(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}