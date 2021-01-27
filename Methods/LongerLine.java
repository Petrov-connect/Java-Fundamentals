package Methods;
//created by J.M.

import java.util.Scanner;

public class LongerLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x1 = Integer.parseInt(scan.nextLine());
        int y1 = Integer.parseInt(scan.nextLine());
        int x2 = Integer.parseInt(scan.nextLine());
        int y2 = Integer.parseInt(scan.nextLine());
        int x3 = Integer.parseInt(scan.nextLine());
        int y3 = Integer.parseInt(scan.nextLine());
        int x4 = Integer.parseInt(scan.nextLine());
        int y4 = Integer.parseInt(scan.nextLine());

        printTheLongestLine(x1, x2, x3, x4, y1, y2, y3, y4);

    }

    private static void printTheLongestLine(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {

        double firstLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double secondLine = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));

        if (firstLine >= secondLine) {

            if (Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)) <= Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2))) {
                System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
            }
        } else {
            if (Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2)) <= Math.sqrt(Math.pow(x4, 2) + Math.pow(y4, 2))) {
                System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%d, %d)(%d, %d)", x4, y4, x3, y3);
            }
        }
    }
}
