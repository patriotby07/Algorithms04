import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KthLargestTest {
    KthLargest kthLargest;

    @BeforeEach
    void setUp() {
        kthLargest = new KthLargest();
    }

    @Test
    void testKthLargestAlgorithmHappyPath9() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;

        int expectedResult = 9;

        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testKthLargestAlgorithmHappyPath7() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4};
        int k = 3;

        int expectedResult = 7;

        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testKthLargestAlgorithmHappyPathEmpty() {
        int[] array = {};
        int k = 3;

        int expectedResult = 0;

        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testKthLargestAlgorithmHappyPathZero() {
        int[] array = {0};
        int k = 3;

        int expectedResult = 0;

        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}