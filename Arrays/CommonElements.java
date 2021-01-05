package Arrays;
//created by J.M.

import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        StringBuilder equals = new StringBuilder();
        for (String s : second) {
            for (String value : first) {
                if (s.equals(value)) {
                    equals.append(s).append(" ");
                }
            }
        }
        System.out.println(equals);
    }
}
