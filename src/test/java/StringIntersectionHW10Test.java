import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIntersectionHW10Test {
    StringIntersectionHW10 stringIntersection;

    @BeforeEach
    void setUp() {
        stringIntersection = new StringIntersectionHW10();
    }

    @Test
    void testStringIntersectionHappyPath() {
        String str1 = "Carrot";
        String str2 = "carwash";
        String expectedResult = "car";

        String actualResult = stringIntersection.stringIntersection(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringIntersectionHappyPath2() {
        String str1 = "Noob";
        String str2 = "Schmooze";
        String expectedResult = "oo";

        String actualResult = stringIntersection.stringIntersection(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringIntersectionHappyPathEmpty() {
        String str1 = "";
        String str2 = "Schmooze";
        String expectedResult = "";

        String actualResult = stringIntersection.stringIntersection(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringIntersectionHappyPathEmpty2() {
        String str1 = "";
        String str2 = "";
        String expectedResult = "";

        String actualResult = stringIntersection.stringIntersection(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStringIntersectionHappyPathLetterNumber() {
        String str1 = "123 fabtr";
        String str2 = "1234 ABCC";
        String expectedResult = "123 ab";

        String actualResult = stringIntersection.stringIntersection(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}