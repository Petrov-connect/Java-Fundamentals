package TextProcessing;
//created by J.M.

import java.util.*;

public class StringExplosion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());

        int strength = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ('>')) {
                strength += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
            } else if (strength > 0 && input.charAt(i) != '>') {
                input.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(input);
    }
}
