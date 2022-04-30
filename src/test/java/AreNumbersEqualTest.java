import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class AreNumbersEqualTest {
    AreNumbersEqual areNumbersEqual;

    @BeforeEach
    void setUp() {
        areNumbersEqual = new AreNumbersEqual();
    }

    @Order(1)
    @Test
    void testAreNumbersEqualHappyPathEqual() {
        int a = 89;
        int b = 89;

        int expectedResult = 0;

        int actualResult = areNumbersEqual.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(2)
    @Test
    void testAreNumbersEqualHappyPathNegativeA() {
        int a = -89;
        int b = 89;

        int expectedResult = -1;

        int actualResult = areNumbersEqual.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(3)
    @Test
    void testAreNumbersEqualHappyPathNegativeB() {
        int a = 89;
        int b = -89;

        int expectedResult = 1;

        int actualResult = areNumbersEqual.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(4)
    @Test
    void testAreNumbersEqualHappyPathMaxMinInteger() {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE + 5;

        int expectedResult = -1;

        int actualResult = areNumbersEqual.areNumbersEqual(a, b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}