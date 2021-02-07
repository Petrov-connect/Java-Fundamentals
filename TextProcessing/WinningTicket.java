package TextProcessing;
//created by J.M.

import java.util.*;
import java.util.stream.IntStream;

public class WinningTicket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",\\s+");
        IntStream.range(0, input.length).forEach(i -> input[i] = input[i].trim());

        for (String s : input) {
            if (s.length() == 20) {
                String left = getLeftRight(s.substring(0, 10));
                String right = getLeftRight(s.substring(10));
                if ((left.charAt(0) == right.charAt(0)) && (left.length() > 5) && (right.length() > 5)) {
                    String jackpot = "";
                    if (left.length() == 10 && right.length() == 10) {
                        jackpot = "Jackpot!";
                    }
                    System.out.printf("ticket \"%s\" - %d%c %s%n", s, Math.min(left.length(), right.length()), left.charAt(0), jackpot);

                } else {
                    System.out.printf("ticket \"%s\" - no match%n", s);
                }
            } else {
                System.out.println("invalid ticket");
            }
        }
    }

    static String getLeftRight(String stringToCheck) {
        StringBuilder output = new StringBuilder();
        char symbol;
        for (int i = 0; i < stringToCheck.length(); i++) {
            if (stringToCheck.charAt(i) == '@' || stringToCheck.charAt(i) == '#' || stringToCheck.charAt(i) == '$' || stringToCheck.charAt(i) == '^') {
                symbol = stringToCheck.charAt(i);
                output.append(symbol);
                for (int j = i + 1; j < stringToCheck.length(); j++) {
                    if (stringToCheck.charAt(j) == symbol) {
                        output.append(stringToCheck.charAt(j));
                    } else {
                        break;
                    }
                }
            }
            if (output.length() > 5) {
                return String.valueOf(output);
            } else {
                if (i > 4) {
                    break;
                }
                output = new StringBuilder();
            }
        }
        return " ";
    }
}
