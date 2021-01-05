package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] num = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (num.length > 1) {
            int[] second = new int[num.length - 1];
            for (int i = 0; i < num.length - 1; i++) {
                second[i] = num[i] + num[i + 1];
                num[i] = second[i];
            }
            num = second;
        }
        System.out.println(num[0]);
    }
}
