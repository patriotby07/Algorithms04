public class OddIndices {
    /**
     * 2. Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     **/

    public int[] oddIndices(int[] array) {

        if (array == null || array.length == 0) {
            return new int[]{};
        }

            int odd = 0;
            int[] result = new int[array.length / 2];

            for (int i = 1; i < array.length; i += 2) {
                result[odd++] = array[i];
            }
            return result;
    }
}
