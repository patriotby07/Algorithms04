import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesHW10Test {
    RemoveDuplicatesHW10 removeDuplicates;

    @BeforeEach
    void setUp() {
        removeDuplicates = new RemoveDuplicatesHW10();
    }

    @Test
    void testRemoveDuplicatesHappyPath() {
        String result = "AABBCCaabbcc";
        String expectedResult = "abc";

        String actualResult = removeDuplicates.removeDuplicates(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRemoveDuplicatesHappyPathEmpty() {
        String result = "";
        String expectedResult = "";

        String actualResult = removeDuplicates.removeDuplicates(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testRemoveDuplicatesHappyPathSpace() {
        String result = " XoNnUOX ";
        String expectedResult = "xonu";

        String actualResult = removeDuplicates.removeDuplicates(result);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}