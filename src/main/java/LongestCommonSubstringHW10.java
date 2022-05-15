public class LongestCommonSubstringHW10 {

    public static boolean isStringValid(String str) {
        if (str != null) {
            if (!str.isEmpty()) {

                return true;
            }
            return false;
        }
        return false;
    }

    public String longestCommonSubstring(String str1, String str2, String str3) {
        if (isStringValid(str1) && isStringValid(str2) && isStringValid(str3)) {
            str1 = str1.trim().toLowerCase();
            str2 = str2.trim().toLowerCase();
            str3 = str3.trim().toLowerCase();

            int start = 0;
            int max = 0;
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    for (int k = 0; k < str3.length(); k++) {
                        int x = 0;
                        while ((str1.charAt(i + x) == str2.charAt(j + x)) &&
                                (str2.charAt(j + x) == (str3.charAt(k + x)))) {
                            x++;
                            if (((i + x) >= str1.length()) || ((j + x) >= str2.length()) ||
                                    ((k + x) >= str3.length())) {
                                break;
                            }
                            if (x > max) {
                                max = x;
                                start = i;
                            }
                        }
                    }
                }
            }
            return str1.substring(start, (start + max));
        }
        return "";
    }
}
