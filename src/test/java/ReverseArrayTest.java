import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {
    ReverseArray reverseArray;

    void setUp() {
        reverseArray = new ReverseArray();
    }

    @Test
    void testReverseArrayHappyPathArrayPositiveNumber() {
        int[] result = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        int[] actualResult = ReverseArray.reverseArray(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testReverseArrayHappyPathArrayNull() {
        int[] result = null;
        int[] expectedResult = {};

        int[] actualResult = ReverseArray.reverseArray(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testReverseArrayHappyPathArrayZero() {
        int[] result = {0};
        int[] expectedResult = {0};

        int[] actualResult = ReverseArray.reverseArray(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testReverseArrayHappyPathArrayEmpty() {
        int[] result = {};
        int[] expectedResult = {};

        int[] actualResult = ReverseArray.reverseArray(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testReverseArrayHappyPathArrayNegativeNumber() {
        int[] result = {-2, -7, -3, -10};
        int[] expectedResult = {-10, -3, -7, -2};

        int[] actualResult = ReverseArray.reverseArray(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    void testReverseArrayHappyPathArrayNegativePositiveNumber() {
        int[] result = {-2, -7, 5, 8, -3, 10};
        int[] expectedResult = {10, -3, 8, 5, -7, -2};

        int[] actualResult = ReverseArray.reverseArray(result);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}