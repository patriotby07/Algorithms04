import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumbersAndSpacesHW10Test {
  StringToNumbersAndSpacesHW10 stringToNumbersAndSpaces;

    @BeforeEach
    void setUp(){
        stringToNumbersAndSpaces = new StringToNumbersAndSpacesHW10();
    }

    @Test
    void testStringToNumbersHappyPath() {
        String result = " {`@AaZz[] 238 We8 8+_§Ё©·ё№АаЯя(f  S..e";
        String expectedResult = "  238 8 8  ";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToNumbersHappyPathSpace() {
        String result = " ";
        String expectedResult = " ";

        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpaces(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}