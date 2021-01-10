package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class MessageTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        StringBuilder word = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            String num = scan.nextLine();
            char symbol;
            if (num.equals("0")) {
                symbol = ' ';
            } else {
                int numberOfDigit = num.length();
                int mainDigit = Integer.parseInt(String.valueOf((num).charAt(0)));
                int offset = (mainDigit - 2) * 3;
                if (mainDigit == 8 || mainDigit == 9) {
                    offset += 1;
                }
                int letterIndex = (offset + numberOfDigit - 1);
                symbol = (char) (97 + letterIndex);
            }
            word.append(symbol);
        }
        System.out.println(word);
    }
}
