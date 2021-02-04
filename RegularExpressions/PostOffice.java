package RegularExpressions;
//created by J.M.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\|");
        Pattern firsWord = Pattern.compile("([#$%*&])([A-Z]+)\\1");
        Matcher firstLetters = firsWord.matcher(input[0]);
        Map<Character, Integer> output = new LinkedHashMap<>();

        while (firstLetters.find()) {
            for (int i = 0; i < firstLetters.group(2).length(); i++) {
                output.put(firstLetters.group(2).charAt(i), 0);
            }
        }
        Pattern secondWord = Pattern.compile("([\\d]{2}):([\\d]{2})");
        Matcher secondLetters = secondWord.matcher(input[1]);
        while (secondLetters.find()) {
            char letter = (char) Integer.parseInt(secondLetters.group(1));
            int length = Integer.parseInt(secondLetters.group(2)) + 1;
            if (output.containsKey(letter)) {
                output.put(letter, length);
            }
        }
        String[] wordToCheck = input[2].split(" ");
        output.forEach((key, value) -> Arrays.stream(wordToCheck)
                .filter(s -> s.length() == value && s.charAt(0) == key).forEach(System.out::println));
    }
}
