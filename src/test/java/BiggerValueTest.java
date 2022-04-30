import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggerValueTest {
    BiggerValue biggerValue;

    @BeforeEach
    void setUp() {
        biggerValue = new BiggerValue();
    }

    @Test
    void testBiggerValueHappyPathPositiveAB() {
        int a = 350;
        int b = 15;
        int expectedResult = 350;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testBiggerValueHappyPathNegativeA() {
        int a = -350;
        int b = 15;
        int expectedResult = 15;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testBiggerValueHappyPathNegativeAB() {
        int a = -350;
        int b = -349;
        int expectedResult = -349;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testBiggerValueHappyPathZeroAPositiveB() {
        int a = 0;
        int b = 349;
        int expectedResult = 349;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testBiggerValueHappyPathZeroANegativeA() {
        int a = -349;
        int b = 0;
        int expectedResult = 0;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult,actualResult,"Тест прошел");
    }

    @Test
    void testBiggerValueHappyPathMaxMinInteger() {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE ;
        int expectedResult = Integer.MAX_VALUE;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void testBiggerValueHappyPathEqualsAB() {
        int a = 350;
        int b = 350;
        int expectedResult = 350;

        int actualResult = biggerValue.biggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}