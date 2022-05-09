import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumbersHW10Test {
    StringToNumbersHW10  stringToNumbers;

    @BeforeEach
    void setUp(){
        stringToNumbers = new StringToNumbersHW10();
    }

    @Test
    void testStringToNumbersHappyPathPositiveNumbers() {
        String result = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = stringToNumbers.stringToNumbers(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathEmpty() {
        String result = "";
        int[] expectedResult = {};

        int[] actualResult = stringToNumbers.stringToNumbers(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathVarious() { // не работает с отрицательными числами
        String result = "1, d, 4, 66, -96";
        int[] expectedResult = {1, 4, 66, 96};

        int[] actualResult = stringToNumbers.stringToNumbers(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathSpaceAndOneNumber() {
        String result = " 1";
        int[] expectedResult = {1};

        int[] actualResult = stringToNumbers.stringToNumbers(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}