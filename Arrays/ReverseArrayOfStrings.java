package Arrays;
//created by J.M.

import java.util.Scanner;

public class ReverseArrayOfStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String oldInput = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = oldInput;
        }
        System.out.print(String.join(" ", input));
    }
}
