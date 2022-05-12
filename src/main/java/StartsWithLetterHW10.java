public class StartsWithLetterHW10 {

    public String startsWithLetter(String str, char letter) {
        str = str.trim().replace(",", "").replace(".", "").replace("\n", " ");

        if (!str.equals("")) {
            String[] strArr = str.split(" ");
            String text = "";

                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i].toLowerCase().charAt(0) == letter) {
                        text += strArr[i] + ", ";
                    }
                }

            return text.substring(0, text.length() - 2);
        }
        return "";
    }
}

