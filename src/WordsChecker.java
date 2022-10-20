import java.util.HashSet;

public class WordsChecker {
    protected String text;
    protected HashSet<String> words = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        String[] sector = text.split("\\P{IsAlphabetic}+");
        for (String word : sector) {
            words.add(word);
        }
    }

    public boolean hasWord(String wordFromQuery) {
        return words.contains(wordFromQuery);
    }

}
