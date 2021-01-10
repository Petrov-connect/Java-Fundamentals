package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class FromLeftToRightTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            long number1 = Long.parseLong(part1);
            long number2 = Long.parseLong(part2);
            long biggest = Math.max(number1, number2);
            int sum = 0;
            while (biggest != 0) {
                sum += biggest % 10;
                biggest /= 10;
            }
            System.out.println(Math.abs(sum));
        }
    }
}
