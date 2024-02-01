public class Main {
    public static void main(String[] args) {
        WordsAndChars wac = new WordsAndChars();
        System.out.println(wac.areUniqueCharacters("kutyaU"));
        System.out.println(wac.countWords("kutya macska boci macska Macska"));
        System.out.println(wac.countWords("kutya Kutya macska boci BOCI pipi Pipi"));
        System.out.println(wac.isPrime(11));
        System.out.println(wac.isPrime(16));
    }
}
