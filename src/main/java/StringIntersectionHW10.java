public class StringIntersectionHW10 {

    public String stringIntersection(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    result += str1.charAt(i);
                    str2 = str2.replaceFirst(str2.charAt(j) + "", "");
                    break;
                }
            }
        }
        return result;
    }
}

