import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumdersHW10Ver2Test {
    StringToNumdersHW10Ver2 stringToNumders;

    @BeforeEach
    void setUp(){
        stringToNumders = new StringToNumdersHW10Ver2();
    }
    @Test
    void testStringToNumdersHW10Ver2() {
        String result = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = stringToNumders.stringToNumdersHW10Ver2(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathEmpty() {
        String result = "";
        int[] expectedResult = {};

        int[] actualResult = stringToNumders.stringToNumdersHW10Ver2(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathVarious() { // не работает с отрицательными числами
        String result = "1, d, 4, 66, -96";
        int[] expectedResult = {1, 4, 6, 6, 9, 6};

        int[] actualResult = stringToNumders.stringToNumdersHW10Ver2(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathSpaceAndOneNumber() {
        String result = " 1";
        int[] expectedResult = {1};

        int[] actualResult = stringToNumders.stringToNumdersHW10Ver2(result);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}