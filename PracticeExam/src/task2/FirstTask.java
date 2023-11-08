package task2;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Give me a string");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("..and a number");
        int num = scanner.nextInt();
        System.out.println(pastingTheSameLetters(text,num));
        scanner.close();
    }
    static String pastingTheSameLetters(String text, int n){
        if(text.matches("[a-zA-Z]+")){
            String string = "";
            for(int i = 0; i < text.length(); i++){
                for(int j = 0; j < n; j++){
                    string = string.concat(Character.toString(text.charAt(i)));
                }
            }
            return string;
        }
        return "";
    }
}
