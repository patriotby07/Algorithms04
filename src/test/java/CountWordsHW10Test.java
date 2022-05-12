import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountWordsHW10Test {
    CountWordsHW10 countWords;

    @BeforeEach
    void setUp() {
        countWords = new CountWordsHW10();
    }

    @Test
    void testCountWordsHappyPathJava() {
        String result = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates " +
                "for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that " +
                "are still receiving security and other upgrades.";
        String word = "Java";
        int expectedResult = 5;

        int actualResult = countWords.countWords(result, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCountWordsHappyPathVersion() {
        String result = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates " +
                "for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that " +
                "are still receiving security and other upgrades.";
        String word = "version";
        int expectedResult = 2;

        int actualResult = countWords.countWords(result, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCountWordsHappyPathVersion2() {
        String result = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates " +
                "for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that " +
                "are still receiving security and other upgrades.";
        String word = "             ,VeRsIoN.             ";
        int expectedResult = 2;

        int actualResult = countWords.countWords(result, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCountWordsHappyPathEmpty() {
        String result = "";
        String word = "version";
        int expectedResult = 0;

        int actualResult = countWords.countWords(result, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCountWordsHappyPathEmpty2() {
        String result = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term " +
                "support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates " +
                "for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that " +
                "are still receiving security and other upgrades.";
        String word = "";
        int expectedResult = 0;

        int actualResult = countWords.countWords(result, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testCountWordsHappyPathEmpty3() {
        String result = "";
        String word = "";
        int expectedResult = 0;

        int actualResult = countWords.countWords(result, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}