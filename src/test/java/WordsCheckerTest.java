import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class WordsCheckerTest {
    WordsChecker wordsChecker;
    private final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    @BeforeEach
    void WordCheckerInit(){
        wordsChecker = new WordsChecker(loremIpsum);
    }

    @Test
    void HasWordPositiveTest(){
        Assertions.assertTrue(wordsChecker.hasWord("tempor"));
        Assertions.assertTrue(wordsChecker.hasWord("reprehenderit"));
    }

    @Test
    void HasWordNegativeTest(){
        Assertions.assertFalse(wordsChecker.hasWord("covfefe"));
        Assertions.assertFalse(wordsChecker.hasWord(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"tempor", "reprehenderit"})
    void HawWordWithParamsTest(String word){
        Assertions.assertTrue(wordsChecker.hasWord(word));
    }
}
