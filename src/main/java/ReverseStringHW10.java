public class ReverseStringHW10 {

    public String reverseString (String str) {
        String text = "";

        if (!str.equals("")) {
            for (int i = str.length() - 1; i >= 0; i--) {
                text += str.charAt(i);
            }
            return  text;
        }
        return  "";
    }
}
