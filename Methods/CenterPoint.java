package Methods;
//created by J.M.

import java.util.Scanner;

public class CenterPoint {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());

        printTheClosestPoint(x1, x2, y1, y2);

    }

    private static void printTheClosestPoint(int x1, int x2, int y1, int y2) {

        if (Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)) <= Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2))) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }
}
