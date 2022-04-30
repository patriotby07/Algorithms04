public class SumArray {
    /**
     * 3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     **/

    public int sumArray(int[] array) {
        int result = 0;

        if (array != null || array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                result += array[i];
            }
            return result;
        }
        return 0;
    }
}
