package TextProcessing;
//created by J.M.

import java.util.*;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (char c : input.toCharArray()) {
            System.out.print((char) (c + 3));
        }
    }
}
