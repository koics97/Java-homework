import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestMethods {

    @ParameterizedTest
    @ValueSource(strings = {"kutya", "macsek", "hulLa", "tundra", "huH", "ciCa", "oltár"})
    void shouldReturnTrueToAreUniqueCharacters(String string) {
        WordsAndChars wac = new WordsAndChars();
        Assertions.assertTrue(wac.areUniqueCharacters(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"alma", "hulla", "papa", "anya", "macska", "olló", "CiCa"})
    void shouldReturnFalseToAreUniqueCharacters(String string) {
        WordsAndChars wac = new WordsAndChars();
        Assertions.assertFalse(wac.areUniqueCharacters(string));
    }

    @ParameterizedTest
    @MethodSource("provideSameStringInDifferentCombinations")
    void expectedWordFrequencies(List<String> strings) {
        WordsAndChars wac = new WordsAndChars();
        Map<String, Integer> countedWords = new HashMap<>();
        countedWords.put("macska", 2);
        countedWords.put("tehén", 2);
        countedWords.put("kutya", 1);

        Map<String, Integer> result = wac.countWords(strings.get(0));

        Assertions.assertEquals(countedWords, result);
    }

    static Stream<List<String>> provideSameStringInDifferentCombinations() {
        return Stream.of(
                List.of("macska Macska tehén Tehén kutya"),
                List.of("macska tehén Macska Tehén kutya"),
                List.of("macska tehén Tehén Macska kutya"),
                List.of("macska tehén Tehén kutya Macska"),
                List.of("macska tehén kutya Tehén Macska"),
                List.of("macska kutya tehén Tehén Macska"),
                List.of("kutya macska tehén Tehén Macska")
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17})
    void shouldReturnTrueToIsPrime(int number) {
        WordsAndChars wac = new WordsAndChars();
        Assertions.assertTrue(wac.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 4, 6, 8, 10, 12, 14, 16})
    void shouldReturnFalseToIsPrime(int number) {
        WordsAndChars wac = new WordsAndChars();
        Assertions.assertFalse(wac.isPrime(number));
    }
}
