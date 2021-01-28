package Methods;
//created by J.M.

import java.util.Scanner;

public class PrintingTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int triangleLength = Integer.parseInt(scan.nextLine());

        printingTriangle(triangleLength);
    }

    private static void printingTriangle(int triangleLength) {
        for (int i = 1; i <= triangleLength; i++) {
            printing(i);
            System.out.println();
        }
        for (int i = triangleLength - 1; i >= 1; i--) {
            printing(i);
            System.out.println();
        }
    }

    private static void printing(int end) {
        for (int j = 1; j <= end; j++) {
            System.out.print(j);
            if (j != end) {
                System.out.print(" ");
            }
        }
    }
}
