public class StringToLettersAndSpacesHW10 {

    public String stringToLettersAndSpaces(String str) {
        if (str.length() != 0) {

            String count = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 32 || (str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123) ||
                        (str.charAt(i) > 1039 && str.charAt(i) < 1104) || str.charAt(i) == 1025 || str.charAt(i) == 1105) {
                    count += str.charAt(i);
                }
            }
            return count;
        }
        return "";
    }
}
