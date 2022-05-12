public class StringToNumbersHW10Ver2 {

    public int[] stringToNumbersHW10Ver2(String str) {
        if (str != "") {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58 || str.charAt(i) == '-') {
                    count++;
                }
            }
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58 || str.charAt(i) == '-') {
                    result[count] = Integer.parseInt(String.valueOf(str.charAt(i)));
                    count++;
                }
            }
            return result;
        }
        return new int[]{};
    }

}
