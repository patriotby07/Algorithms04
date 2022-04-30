import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {
    OddEven oe;

    @BeforeEach
    void setUp() {
        oe = new OddEven();
    }

    @Order(1)
//    @RepeatedTest(50) // прогонка теста 50 раз!
    @Test
    public void testOddEvenHappyPathOdd() {
        long num = 5;
        String expectedResult = "Odd";

//        OddEven oe = new OddEven(); //  @BeforeEach позволяет убрать и не повторять эту строчку
        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathEven() {
        long num = 88;
        String expectedResult = "Even";

        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathNegativeNumber() {
        long num = -856888;
        String expectedResult = "Even";

        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathZeroNumber() {
        long num = 0;
        String expectedResult = "Even";

        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathPositiveUndefinedNumber() {
        long num = 2147483648L;
        String expectedResult = "Undefined";

        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddEvenHappyPathNegativeUndefinedNumber() {
        long num = -2147483649L;
        String expectedResult = "Undefined";

        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddPathIntegerMinMinusNumber() {
        long num = 2147483647 + 1L;
        String expectedResult = "Undefined";

        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddPathIntegerMaxPlusNumber() {
        long num = -2147483648 - 1L;

        String expectedResult = "Undefined";

        String actualResult = oe.oddEven(num);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
