public class Intersection {
    /**
     * 9. 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив общих элементов.
     * Test Data:
     * {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
     * {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
     * {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     **/

    public int[] intersection(int[] array1, int[] array2) { // полу-рабочий вариант
        if (array1.length == 0 || array2.length == 0) {
            return new int[]{};
        }
        int length = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    length++;
                }
            }
        }
        int[] arrayResult = new int[length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    arrayResult[count] = array1[i];
                    count++;
                }
            }
        }

        return arrayResult;
    }
}

