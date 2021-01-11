package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class PrintPartOfASCIITable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (char a = (char) start; a <= end; a++) {
            System.out.printf("%c ", a);
        }
    }
}
