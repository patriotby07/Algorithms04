public class OddEven {
    /**
     * 1. Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
     * и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     * 2147483647 + 1 →  “Undefined”
     **/

    public String oddEven(long num) {

        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE) {

            return "Undefined";
        } else if (num % 2 == 0) {

            return "Even";
        } else

            return "Odd";
    }
}
