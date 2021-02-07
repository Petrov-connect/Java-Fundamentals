package TextProcessing;
//created by J.M.

import java.util.*;

public class ReplaceRepeatingChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                input.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(input);
    }
}
