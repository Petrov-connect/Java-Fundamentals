package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class TriplesOfLatinLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (char a = 97; a < 97 + n; a++) {
            for (char b = 97; b < 97 + n; b++) {
                for (char c = 97; c < 97 + n; c++) {
                    System.out.printf("%c%c%c%n", a, b, c);
                }
            }
        }
    }
}
