import java.util.Arrays;
import java.util.HashSet;

public class WordsChecker {
    private HashSet<String> words;

    public WordsChecker(String text){
        words = new HashSet<>(Arrays.stream(text.split("\\P{IsAlphabetic}+")).toList());
    }

    public boolean hasWord(String word){
        return words.contains(word);
    }
}
