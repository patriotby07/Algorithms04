import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxAve1Test {

    MinMaxAve1 minMaxAve;

    @BeforeEach
    void setUp() {
        minMaxAve = new MinMaxAve1();
    }

    @Test
    void testMinMaxAveHappyPathPositiveNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;

        int[] expectedResult = {3, 7, 5};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathPositiveArrayNegativeNumber() {
        int[] array = {-9, 2, -15, 2, 2, 6, 7, 8};
        int a = 0;
        int b = 2;

        int[] expectedResult = {-15, 2, -7};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathArrayEqualsNumber() {
        int[] array = {2, 2, 2, 2, 2, 6, 7, 8};
        int a = 0;
        int b = 3;

        int[] expectedResult = {2, 2, 2};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathArrayNull() {
        int[] array = null;
        int a = 0;
        int b = 3;

        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathArrayEmpty() {
        int[] array = {};
        int a = 0;
        int b = 3;

        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathArrayTwoElement() {
        int[] array = {1, 2};
        int a = 0;
        int b = 3;

        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathArrayZero() {
        int[] array = {0};
        int a = 0;
        int b = 0;

        int[] expectedResult = {0, 0, 0};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathArrayNegativePositiveNumber() {
        int[] array = {1, -1};
        int a = 0;
        int b = 1;

        int[] expectedResult = {-1, -1, 0};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testMinMaxAveHappyPathArrayAMoreB() {
        int[] array = {1, -1};
        int a = 8;
        int b = 3;

        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}