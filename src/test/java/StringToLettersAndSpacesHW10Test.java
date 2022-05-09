import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToLettersAndSpacesHW10Test {
    StringToLettersAndSpacesHW10 stringToLettersAndSpaces;

    @BeforeEach
    void setUp(){
        stringToLettersAndSpaces = new StringToLettersAndSpacesHW10();
    }

    @Test
    void testStringToLettersAndSpacesHappyPath() {
        String result = " {`@AaZz[] 238 We8 8+_§Ё©·ё№АаЯя(f  S..e";
        String expectedResult = " AaZz  We ЁёАаЯяf  Se";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToLettersAndSpacesHappyPathEmpty() {
        String result = "";
        String expectedResult = "";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToLettersAndSpacesHappyPathLetters() {
        String result = "A a Z  z";
        String expectedResult = "A a Z  z";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringToLettersHappyPathNumberAndLetter() {
        String result = "A a 1 Z  3 z5 ";
        String expectedResult = "A a  Z   z ";

        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpaces(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}