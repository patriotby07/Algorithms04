import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToLettersHW10Test {
    StringToLettersHW10 stringToLetters;

    @BeforeEach
    void setUp(){
        stringToLetters = new StringToLettersHW10();
    }

    @Test
    void testStringToLettersHappyPath() {
        String result = "{`@AaZz[]238We88+_§Ё©·ё№АаЯя(fsfsFSDSS..e";
        String expectedResult = "AaZzWeЁёАаЯяfsfsFSDSSe";

        String actualResult = stringToLetters.stringToLetters(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToLettersHappyPathEmpty() {
        String result = "";
        String expectedResult = "";

        String actualResult = stringToLetters.stringToLetters(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToLettersHappyPathNumbers() {
        String result = " 324324               235435 34534 ";
        String expectedResult = "";

        String actualResult = stringToLetters.stringToLetters(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}