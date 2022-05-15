import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringHW10Test {
    LongestCommonSubstringHW10 longestCommonSubstring;

    @BeforeEach
    void setUp(){
        longestCommonSubstring = new LongestCommonSubstringHW10();
    }

    @Test
    void testLongestCommonSubstringHappyPath() {
        String str1 = "Smaze";
        String str2 = "amazing";
        String str3 = "amazon";
        String expectedResult = "maz";

        String actualResult = longestCommonSubstring.
                longestCommonSubstring(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testLongestCommonSubstringHappyPathEmpty() {
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String expectedResult = "";

        String actualResult = longestCommonSubstring.
                longestCommonSubstring(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}