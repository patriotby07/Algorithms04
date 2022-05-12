import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringHW10Test {
    ReverseStringHW10 reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseStringHW10();
    }

    @Test
    void testReverseStringHappyPathLetters() {
        String result = "Abracadabra";
        String expectedResult = "arbadacarbA";

        String actualResult = reverseString.reverseString(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testReverseStringHappyPathNumbers() {
        String result = "01234 56789";
        String expectedResult = "98765 43210";

        String actualResult = reverseString.reverseString(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testReverseStringHappyPathEmpty() {
        String result = "";
        String expectedResult = "";

        String actualResult = reverseString.reverseString(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testReverseStringHappyPathLetterAndNumbers() {
        String result = " 911 AbC ";
        String expectedResult = " CbA 119 ";

        String actualResult = reverseString.reverseString(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}