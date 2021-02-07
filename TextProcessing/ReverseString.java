package TextProcessing;
//created by J.M.

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());

        System.out.println(input.reverse());
    }
}
