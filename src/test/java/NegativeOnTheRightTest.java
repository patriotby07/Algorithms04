import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NegativeOnTheRightTest {
    NegativeOnTheRight negativeOnTheRight;

    @BeforeEach
    void setUp() {
        negativeOnTheRight = new NegativeOnTheRight();
    }

    @Test
    void TestNegativeOnTheRight() {
        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void TestNegativeOnTheRightEmpty() {
        int[] array = {};

        int[] expectedResult = {};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void TestNegativeOnTheRightZero() {
        int[] array = {0};

        int[] expectedResult = {0};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void TestNegativeOnTheRightNegativeNumber() {
        int[] array = {-4, -7, -5, -9, -4, -12, -2, -12, -3};

        int[] expectedResult = {-3, -12, -2, -12, -4, -9, -5, -7, -4};

        int[] actualResult = negativeOnTheRight.negativeOnTheRight(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}