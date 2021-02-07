package TextProcessing;
//created by J.M.

import java.util.*;

public class RepeatStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String s : input) {
            result.append(s.repeat(s.length()));
        }
        System.out.println(result);
    }
}
