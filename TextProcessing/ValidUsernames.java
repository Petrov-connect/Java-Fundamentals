package TextProcessing;
//created by J.M.

import java.util.*;

public class ValidUsernames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",\\s");

        for (String s : input) {
            boolean isValid = true;
            if (s.length() < 3 || s.length() > 16) {
                isValid = false;
            } else {
                for (int j = 0; j < s.length(); j++) {
                    if (!Character.isLetterOrDigit(s.charAt(j)) && s.charAt(j) != '-' && s.charAt(j) != '_') {
                        isValid = false;
                    }
                }
            }
            if (isValid) {
                System.out.println(s);
            }
        }
    }
}
