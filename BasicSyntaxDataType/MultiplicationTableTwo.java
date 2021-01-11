package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class MultiplicationTableTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());

        if (num > 10) {
            System.out.println(n + " X " + num + " = " + n * num);
        } else {
            for (int i = num; i <= 10; i++) {
                System.out.println(n + " X " + i + " = " + n * i);
            }
        }
    }
}
