package TextProcessing;
//created by J.M.

import java.util.*;

public class MultiplyBigNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().replaceFirst("^0+", "");
        int key = Integer.parseInt(scan.nextLine());

        StringBuilder output = new StringBuilder();

        if (key != 0) {
            int leftDigit = 0;
            for (int i = input.length() - 1; i >= 0; i--) {
                int nextDigit = Integer.parseInt(String.valueOf(input.charAt(i)));
                int currentDigit = nextDigit * key + leftDigit;
                if (i == 0) {
                    output.insert(0, currentDigit);
                } else {
                    leftDigit = currentDigit / 10;
                    output.insert(0, currentDigit % 10);
                }
            }
        } else {
            output.append(0);
        }
        System.out.println(output);
    }
}
