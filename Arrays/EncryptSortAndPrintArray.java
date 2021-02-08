package Arrays;
//created by J.M.

import java.util.Scanner;

public class EncryptSortAndPrintArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        char[] equals = new char[]{'A', 'E', 'O', 'U', 'I', 'a', 'e', 'o', 'u', 'i'};
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            int sum = 0;

            for (int j = 0; j < input.length(); j++) {
                char symbol = (input).charAt(j);
                boolean isVowel = false;
                for (char equal : equals) {
                    if (symbol == equal) {
                        isVowel = true;
                        break;
                    }
                }
                if (isVowel) {
                    sum += symbol * input.length();
                } else {
                    sum += symbol / input.length();
                }
            }
            numbers[i] = sum;
        }
        SelectionSortInt(numbers);
        for (int number : numbers) System.out.println(number);
    }

    private static void SelectionSortInt(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }
}
