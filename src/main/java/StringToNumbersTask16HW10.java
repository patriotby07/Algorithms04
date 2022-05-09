public class StringToNumbersTask16HW10 {

    public String StringToNumbers(String str) {
        if (str.length() != 0) {

            String count = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    count += str.charAt(i);
                }
            }
            return count;
        }
        return "";
    }
}
