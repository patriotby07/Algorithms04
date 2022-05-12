import java.util.Objects;

public class CountWordsHW10 {

    public int countWords(String text, String word) { //можно еще решить указав ASCII коды
        word = word.trim().toLowerCase().replace(",", "").replace(".", "");
        text = text.trim().toLowerCase().replace(",", "").replace(".", "");
        String[] strArr = text.split(" ");
        int count = 0;

        if (!text.equals("") || !word.equals("")) {
            for (int i = 0; i < strArr.length; i++) {
                if (Objects.equals(strArr[i], word)) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}
