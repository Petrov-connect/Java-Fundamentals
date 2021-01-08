package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class BalancedBrackets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        boolean unbalanced = false;
        boolean first = false;
        int count1 = 0;
        int count2 = 0;

        for (int i = 1; i <= n; i++) {
            String input = scan.nextLine();
            if (((input.equals("(")) && first)) {
                unbalanced = true;
            } else {
                if (input.equals("(")) {
                    count1++;
                    first = true;
                } else if (input.equals(")")) {
                    count2++;
                    first = false;
                }
            }
            if ((first && i == n)) {
                unbalanced = true;
            }
        }
        if (!unbalanced && count1 == count2) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
