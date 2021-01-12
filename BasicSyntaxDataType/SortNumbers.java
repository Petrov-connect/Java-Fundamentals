package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int max,min,mid;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        if (num3 > max) {
            mid = max;
            max = num3;
        } else if (num3 < min) {
            mid = min;
            min = num3;
        } else {
            mid = num3;
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
