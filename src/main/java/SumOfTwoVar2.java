public class SumOfTwoVar2 {
    // Вариант 2(без замены значений в массиве)

    public int[][] sumOfTwoAlgorithms(int[] array, int n) {
        int[][] result = {{}};
        int count = 0;

        if (array.length > 0) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        count++;
                    }
                }
            }
            result = new int[count][2];
            count = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        result[count][0] = array[i];
                        result[count][1] = array[j];
                        count++;
                    }
                }
            }
        }

        return result;
    }
}
