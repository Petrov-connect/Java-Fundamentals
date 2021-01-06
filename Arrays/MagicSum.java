package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
