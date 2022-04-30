import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class SortArrayTest {
    SortArray sortArray;

    @BeforeEach
    void setUp() {
        sortArray = new SortArray();
    }

    @Order(1)
    @Test
    void testSortArrayHappyPathArrayPositiveNumber() {
        int[] result = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int[] actualResult = sortArray.sortArray(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    void testSortArrayHappyPathArrayNull() {
        int[] result = null;
        int[] expectedResult = null;

        int[] actualResult = sortArray.sortArray(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    void testSortArrayHappyPathArrayEmpty() {
        int[] result = {};
        int[] expectedResult = {};

        int[] actualResult = sortArray.sortArray(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    void testSortArrayHappyPathArrayZero() {
        int[] result = {0};
        int[] expectedResult = {0};

        int[] actualResult = sortArray.sortArray(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    void testSortArrayHappyPathArrayNegativePositiveNumber() {
        int[] result = {-999, -4, 3, 7, -12, 5, 2, -9, 4, 12, 999};
        int[] expectedResult = {-999, -12, -9, -4, 2, 3, 4, 5, 7, 12, 999};

        int[] actualResult = sortArray.sortArray(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    void testSortArrayHappyPathArrayEqualsNumber() {
        int[] result = {777, 777, 777, 777};
        int[] expectedResult = {777, 777, 777, 777};

        int[] actualResult = sortArray.sortArray(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}