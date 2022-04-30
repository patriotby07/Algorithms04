import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class MinMaxAveTest {
    MinMaxAve minMaxAve;

    @BeforeEach
    void setUp() {
        minMaxAve = new MinMaxAve();
    }

    @Order(1)
    @Test
    void testMinMaxAveHappyPathPositiveNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;

        Object[] expectedResult = {3, 7, 5.0};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    void testMinMaxAveHappyPathPositiveArrayNegativeNumber() {
        int[] array = {-9, 2, -15, 2, 2, 6, 7, 8};
        int a = 0;
        int b = 2;

        Object[] expectedResult = {-15, 2, -7.33};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    void testMinMaxAveHappyPathArrayEqualsNumber() {
        int[] array = {2, 2, 2, 2, 2, 6, 7, 8};
        int a = 0;
        int b = 3;

        Object[] expectedResult = {2, 2, 2.0};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    void testMinMaxAveHappyPathArrayNull() {
        int[] array = null;
        int a = 0;
        int b = 3;

        Object[] expectedResult = {};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    void testMinMaxAveHappyPathArrayEmpty() {
        int[] array = {};
        int a = 0;
        int b = 3;

        Object[] expectedResult = {};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(6)
    @Test
    void testMinMaxAveHappyPathArrayTwoElement() {
        int[] array = {1, 2};
        int a = 0;
        int b = 3;

        Object[] expectedResult = {1, 2, 1.5};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(7)
    @Test
    void testMinMaxAveHappyPathArrayZero() {
        int[] array = {0};
        int a = 0;
        int b = 3;

        Object[] expectedResult = {0, 0, 0.0};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(8)
    @Test
    void testMinMaxAveHappyPathArrayNegativePositiveNumber() {
        int[] array = {1, -1};
        int a = 0;
        int b = 3;

        Object[] expectedResult = {-1, 1, 0.0};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(9)
    @Test
    void testMinMaxAveHappyPathArrayAMoreB() {
        int[] array = {1, -1};
        int a = 8;
        int b = 3;

        Object[] expectedResult = {};

        Object[] actualResult = minMaxAve.minMaxAve(array, a, b);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}