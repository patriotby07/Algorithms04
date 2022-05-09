public class StringToNumbersHW10 {
    /** 15. Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5} **/

    public int[] stringToNumbers(String str) { //не работает с отрицательными числами
        String[] strArr = str.trim().split("\\D+");
        int[] array = new int[strArr.length];

        if (str.length() != 0){

            for (int i = 0; i < strArr.length; i++) {
                array[i] = Integer.parseInt(strArr[i]);
            }
            return array;
        }
       return new int[]{};
    }

//    public static void main(String[] args) {
//        String result = "1, d, 4; - |. 4, 66, -96";
//        String res = "ab1/2   3: 4 - 5";
//        str.replaceAll("[^0-9\\-]","");
//        str.split("\\D+");
//        result = result.replaceAll("[^0-9\\-\\,]","");
//
//        String[] strArr = result.split(" ");
//        System.out.println(Arrays.toString(strArr));
//    }
}
