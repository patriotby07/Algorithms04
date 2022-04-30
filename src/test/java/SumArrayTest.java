import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class SumArrayTest {
    SumArray sumArray;

    @BeforeEach
    void setUp() {
        sumArray = new SumArray();
    }

    @Order(1)
    @Test
    void testSumArrayHappyPathArrayPositiveNumber() {
        int[] result = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = sumArray.sumArray(result);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    void testSumArrayHappyPathArrayNegativeNumber() {
        int[] result = {-7, -3};
        int expectedResult = -10;

        int actualResult = sumArray.sumArray(result);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    void testSumArrayHappyPathArrayZeroNumber() {
        int[] result = {0};
        int expectedResult = 0;

        int actualResult = sumArray.sumArray(result);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test
    void testSumArrayHappyPathArrayEmpty() {
        int[] result = {};
        int expectedResult = 0;

        int actualResult = sumArray.sumArray(result);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    void testSumArrayHappyPathArrayNegativePositiveNumber() {
        int[] result = {-7, -15, -5, 15, 10, 2, -4, 5};
        int expectedResult = 1;

        int actualResult = sumArray.sumArray(result);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(6)
    @Test
    void testSumArrayHappyPathArrayMaxMinInteger() {
        int[] result = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int expectedResult = -1;

        int actualResult = sumArray.sumArray(result);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testSumArrayNotEquals() {
        int[] result = {10, 12, 13, 55, 2, -14, -8};
        int expectedResult = 71;

        int actualResult = sumArray.sumArray(result);

        Assertions.assertNotEquals(expectedResult,actualResult);
    }
}