package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class SumEvenNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arrayNumbers = scan.nextLine().split(" ");

        int[] numbers = new int[arrayNumbers.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arrayNumbers[i]);
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
