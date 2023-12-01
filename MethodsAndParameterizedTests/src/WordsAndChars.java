import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordsAndChars {

    boolean areUniqueCharacters(String text) {
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (characters.contains(character)) {
                return false;
            } else {
                characters.add(character);
            }
        }
        return true;
    }

    Map<String, Integer> countWords(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> countedWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (countedWords.containsKey(word)) {
                countedWords.put(word, countedWords.get(word) + 1);
            } else {
                countedWords.put(word, 1);
            }
        }
        return countedWords;
    }

    boolean isPrime(int number) {
        if(number == 0 || number == 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
