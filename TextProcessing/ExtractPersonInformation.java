package TextProcessing;
//created by J.M.

import java.util.*;

public class ExtractPersonInformation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = (scan.nextLine());

            System.out.printf("%s is %s years old.%n", input.substring((input.indexOf("@") + 1)
                    , input.indexOf("|")), input.substring((input.indexOf("#") + 1), input.indexOf("*")));
        }
    }
}
