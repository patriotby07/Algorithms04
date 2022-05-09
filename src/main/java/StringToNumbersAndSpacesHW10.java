public class StringToNumbersAndSpacesHW10 {

    public String StringToNumbersAndSpaces(String str) {
        if (str.length() != 0) {

            String count = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58 || str.charAt(i) == 32) {
                    count += str.charAt(i);
                }
            }
            return count;
        }
        return "";
    }
}
