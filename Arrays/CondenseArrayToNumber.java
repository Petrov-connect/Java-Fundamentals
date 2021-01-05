package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] num = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = num.length - 1;
        while (count > 0) {
            for (int i = 0; i < num.length - 1; i++) {
                int sum = num[i] + num[i + 1];
                num[i] = sum;
            }
            count--;
        }
        System.out.println(num[0]);
    }
}
