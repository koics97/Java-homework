package task2;

import java.util.Arrays;
import java.util.Comparator;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println(concatStringFromMaxToMin("kuka", "kutya", "asd", "hablatyolajo"));
        System.out.println(concatStringFromMaxToMin("cica", "hal", "vaddisznó", "zsiráf"));
    }

    static String concatStringFromMaxToMin(String string1, String string2, String string3, String string4) {
        String[] strings = {string1, string2, string3, string4};
        String concatenatedStrings = "";
        Arrays.sort(strings, Comparator.comparingInt(String::length).reversed());
        for (String string : strings) {
            concatenatedStrings = concatenatedStrings.concat(string);
        }
        for (String string : strings) {
            if(string.length() >= 15){
                System.out.println("BINGO");
                break;
            }
        }
        return concatenatedStrings;
    }
}
