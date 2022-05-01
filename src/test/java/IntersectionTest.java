import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntersectionTest {
    Intersection intersection;

    @BeforeEach
    void setUp() {
        intersection = new Intersection();
    }

    @Test
    void testIntersectionPositiveNumber() {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2};

        int[] expectedResult = {2, 4};

        int[] actualResult = intersection.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testIntersectionPositiveNumber1() {
        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};

        int[] expectedResult = {8, 9};

        int[] actualResult = intersection.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testIntersectionPositiveNumber2() {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};

        int[] expectedResult = {};

        int[] actualResult = intersection.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testIntersectionPositiveNumber3() {
        int[] arr1 = {1, 2, 4, 2, 2, 5, 89};
        int[] arr2 = {8, 2, 9, 45, 5, 5};

        int[] expectedResult = {2, 2, 2, 5, 5};

        int[] actualResult = intersection.intersection(arr1, arr2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}