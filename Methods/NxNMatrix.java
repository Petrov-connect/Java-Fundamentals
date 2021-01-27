package Methods;
//created by J.M.

import java.util.Scanner;

public class NxNMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        printMatrix(n);
    }

    private static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
