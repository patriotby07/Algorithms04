import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartsWithLetterHW10Test {
    StartsWithLetterHW10 startsWithLetter;

    @BeforeEach
    void setUp() {
        startsWithLetter = new StartsWithLetterHW10();
    }

    @Test
    void testStartsWithLetterHappyPathLetterL() {
        String result = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        char letter = 'l';
        String expectedResult = "lame, love, lame, live, Look";

        String actualResult = startsWithLetter.startsWithLetter(result, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    void testStartsWithLetterHappyPathEmpty() {
        String result = " ";
        char letter = 'l';
        String expectedResult = "";

        String actualResult = startsWithLetter.startsWithLetter(result, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStartsWithLetterHappyPathEmpty2() {
        String result = "";
        char letter = 'l';
        String expectedResult = "";

        String actualResult = startsWithLetter.startsWithLetter(result, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testStartsWithLetterHappyPathLetterT() {
        String result = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        char letter = 't';
        String expectedResult = "takes, To, Take, thy, truth, these, thy, to, this, then, that, this, That, thy, thy, " +
                "that, thee, This, then, ten, times";

        String actualResult = startsWithLetter.startsWithLetter(result, letter);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}