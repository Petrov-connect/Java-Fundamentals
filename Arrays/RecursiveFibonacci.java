package Arrays;
//created by J.M.

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        if (n == 0) {
            System.out.println(0);
            return;
        }
        arr[0] = 1;
        if (n != 1) {
            arr[1] = 1;
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        System.out.println(arr[n - 1]);
    }
}
