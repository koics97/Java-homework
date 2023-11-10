package task2;

import java.util.ArrayList;
import java.util.List;

public class ThirdTask {
    public static void main(String[] args) {
        if(isValidHungarianText("kuta allat")){
            System.out.println("good job");
        }else{
            System.out.println("Better luck next time!");
        }
    }
    static boolean isValidHungarianText(String text){
        String[] hungarianChars = {"á","é","í","ó","ö","ő","ú","ü","ű","dz","dzs","cs","gy","ly","ny","sz","ty","zs"};
        String[] words = text.split(" ");
        int countOfValidWords = 0;
        List<String> invalidWords = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < hungarianChars.length; j++){
                if(words[i].contains(hungarianChars[j])){
                    countOfValidWords++;
                    break;
                }else if(j == hungarianChars.length-1 && !(words[i].contains(hungarianChars[j]))){
                    invalidWords.add(words[i]);
                }
            }
        }
        System.out.println("There are " + countOfValidWords + " valid hungarian words");
        if(countOfValidWords == 0){
            System.out.println("The invalid words are: ");
            for(String invalidWord:invalidWords){
                System.out.println(invalidWord);
            }
            return false;
        }
        return true;
    }
}
