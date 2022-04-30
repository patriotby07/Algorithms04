import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPositiveNumberTest {
    IsPositiveNumber isPositiveNumber;

    @BeforeEach
    void setUp() {
    isPositiveNumber = new IsPositiveNumber();
    }

    @Test
    void testIsPositiveNumberHappyPathPositiveNum() {
        int num = 555;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumber(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testIsPositiveNumberHappyPathZeroNum() {
        int num = 0;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumber(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testIsPositiveNumberHappyPathNegativeNum() {
        int num = -555;
        boolean expectedResult = false;

        boolean actualResult = isPositiveNumber.isPositiveNumber(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testIsPositiveNumberHappyPathPositiveMaxIntegerPlus() { //!!!!!!!!!!!!!!!!!!!!!!!Уточнить!!!!!!!!!!!!!!
        int num = Integer.MAX_VALUE + 5;
        boolean expectedResult = false;

        boolean actualResult = isPositiveNumber.isPositiveNumber(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}