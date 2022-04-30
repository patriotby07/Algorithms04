public class MinMaxAve {
    /**
     * 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[] и 2 значения индексов. Алгоритм возвращает
     * массив, который содержит минимальное значение, максимальное значение и среднее среди всех значений между
     * 2-мя индексами.
     * Test Data:
     * ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     **/

    public Object[] minMaxAve(int[] array, int a, int b) {

        if (array == null || array.length == 0 || a > b) {
            return new Object[]{};
        }
        int min = array[a];
        int max = array[a];
        int ave = 0;
        int count = 0;

        if (array.length <= 3) {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                if (min > array[i]) {
                    min = array[i];
                }
                ave += array[i];
                count++;
            }
        } else {
            for (int i = a; i <= b; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                if (min > array[i]) {
                    min = array[i];
                }
                ave += array[i];
                count++;
            }
        }
        return new Object[]{min, max, Double.parseDouble(String.format("%.2f", (ave / (double) count)))};
    }
}
