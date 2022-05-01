public class MinMaxAve1 {
    /**
     * 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов. Алгоритм возвращает
     * массив, который содержит минимальное значение, максимальное значение и среднее среди всех значений между
     * 2-мя индексами.
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     **/

    public int[] minMaxAve(int[] array, int a, int b) {
        if (array == null || array.length == 0 || a > b || a < 0 || b > array.length) {
            return new int[]{};
        }

        int min = array[a];
        int max = array[b];
        int ave = 0;
        int count = 0;

        for (int i = a; i <= b ; i++) {
            if (array[a] < array[i]) {
                max = array[i];
            }
            if (array[a] > array[i]) {
                min = array[i];
            }
            count += array[i];
        }
        ave = count / (b - a + 1);

        return new int[]{min, max, ave};
    }
}





