public class StringToNumdersHW10Ver2 {

    public int[] stringToNumdersHW10Ver2(String str) {
        if (str != "") {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    count++;
                }
            }
            int[] result = new int[count];
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    result[count] = Integer.parseInt(String.valueOf(str.charAt(i)));
                    count++;
                }
            }
            return result;
        }
        return new int[]{};
    }
}
