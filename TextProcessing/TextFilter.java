package TextProcessing;
//created by J.M.

import java.util.*;

public class TextFilter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] bannedWords = scan.nextLine().split(", ");
        String input = scan.nextLine();

        for (String bannedWord : bannedWords) {
            input = input.replaceAll(bannedWord, new String(new char[bannedWord.length()]).replace('\0', '*'));
        }
        System.out.println(input);
    }
}

