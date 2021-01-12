package BasicSyntaxDataType;
//created by J.M.

import java.util.*;

public class ReverseStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input;

        while (!"end".equals(input = scan.nextLine())) {
            System.out.printf("%s = %s%n", input, new StringBuilder(input).reverse());
        }
    }
}
