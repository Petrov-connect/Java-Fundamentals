package Methods;
//created by J.M.

import java.util.Scanner;

public class RepeatString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int repetition = Integer.parseInt(scan.nextLine());

        System.out.println(repeatString(s, repetition));
    }

    private static StringBuilder repeatString(String s, int count) {
        StringBuilder output = new StringBuilder();
        output.append(String.valueOf(s).repeat(count));
        return output;
    }
}
