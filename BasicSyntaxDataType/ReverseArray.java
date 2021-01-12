package BasicSyntaxDataType;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int oldNum = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = oldNum;
        }
        Arrays.stream(numbers).mapToObj(number -> number + " ").forEach(System.out::print);
    }
}
