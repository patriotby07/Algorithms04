public class NegativeOnTheRight {
    /**
     * 13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,
     * в котором все негативные числа находятся во второй половине массива
     * Test Data:
     * {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     **/
    public int[] negativeOnTheRight(int[] array) {
        int[] result = new int[array.length];
        int count = result.length - 1;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[count] = array[i];
                count--;
            } else if (array[i] > 0) {
                result[count2] = array[i];
                count2++;
            }
        }

        return result;
    }
}
