public class RemoveDuplicatesHW10 {

    public String removeDuplicates(String str) {
        String text = "";

        if (str != "") {
            str = str.trim().toLowerCase();
            for (int i = 0; i < str.length();) {
                text += String.valueOf(str.charAt(i));
                str = str.replace(String.valueOf(str.charAt(i)), "");
            }
            return text;
        }
        return "";
    }
}
