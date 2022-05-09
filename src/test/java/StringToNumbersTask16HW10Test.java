import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumbersTask16HW10Test {
    StringToNumbersTask16HW10 stringToNumbers;

    @BeforeEach
    void setUp (){
        stringToNumbers = new StringToNumbersTask16HW10();
    }

    @Test
    void testStringToNumbersHappyPath() {
        String result = " {`@AaZz[] 238 We8 8+_§Ё©·ё№АаЯя(f  S..e";
        String expectedResult = "23888";

        String actualResult = stringToNumbers.StringToNumbers(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathEmpty() {
        String result = "";
        String expectedResult = "";

        String actualResult = stringToNumbers.StringToNumbers(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathBoundaryValues() {
        String result = "/09:";
        String expectedResult = "09";

        String actualResult = stringToNumbers.StringToNumbers(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}