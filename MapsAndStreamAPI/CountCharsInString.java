package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class CountCharsInString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<Character, Integer> output = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (key != 32) {
                output.put(key, !output.containsKey(key) ? 1 : output.get(key) + 1);
            }
        }
        output.forEach((key, value) -> System.out.printf("%c -> %d%n", key, value));
    }
}
