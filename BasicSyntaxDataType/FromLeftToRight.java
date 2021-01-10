package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class FromLeftToRight {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            long left = scan.nextLong();
            long right = scan.nextLong();
            int sum = 0;
            long biggest = Math.max(left, right);
            while (biggest != 0) {
                sum += biggest % 10;
                biggest /= 10;
            }
            System.out.println(Math.abs(sum));
        }
    }
}
