import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAndBadNumberTest {
    GoodAndBadNumber goodAndBadNumber;

    @BeforeEach
    void setUp() {
        goodAndBadNumber = new GoodAndBadNumber();
    }

    @Test
    void testGoodAndBadNumberHappyPathEvenBoth() {
        int m = 15;

        String expectedResult = "Good Number";

        String actualResult = goodAndBadNumber.goodAndBadNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGoodAndBadNumberHappyPathEvenThree() {
        int m = 9;

        String expectedResult = "Bad Number";

        String actualResult = goodAndBadNumber.goodAndBadNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGoodAndBadNumberHappyPathEvenFive() {
        int m = 10;

        String expectedResult = "Poor Number";

        String actualResult = goodAndBadNumber.goodAndBadNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGoodAndBadNumberHappyPathZero() {
        int m = 0;

        String expectedResult = "Good Number";

        String actualResult = goodAndBadNumber.goodAndBadNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGoodAndBadNumberHappyPathOddBoth() {
        int m = 1;

        String expectedResult = "-1";

        String actualResult = goodAndBadNumber.goodAndBadNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGoodAndBadNumberHappyPathNegativeNumber() {
        int m = -17;

        String expectedResult = "-1";

        String actualResult = goodAndBadNumber.goodAndBadNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testGoodAndBadNumberHappyPathNegativeNumberEvenBoth() {
        int m = -555;

        String expectedResult = "Good Number";

        String actualResult = goodAndBadNumber.goodAndBadNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}