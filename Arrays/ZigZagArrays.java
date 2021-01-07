package Arrays;
//created by J.M.

import java.util.Scanner;

public class ZigZagArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String[] first = new String[n];
        String[] second = new String[n];

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(" ");
            if (i % 2 == 0) {
                second[i] = line[0];
                first[i] = line[1];
            } else {
                first[i] = line[0];
                second[i] = line[1];
            }
        }
        System.out.print(String.join(" ", second));
        System.out.print("\n" + String.join(" ", first));
    }
}
