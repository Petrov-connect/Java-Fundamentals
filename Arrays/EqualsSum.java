package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class EqualsSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int k = i - 1; k >= 0; k--) {
                sumLeft += arr[k];
            }
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
