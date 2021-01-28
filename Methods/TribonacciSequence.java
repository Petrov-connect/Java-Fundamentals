package Methods;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        printSequenceToNum(num);

    }

    private static void printSequenceToNum(int num) {
        int[] arr = new int[num];
        if (num == 1) {
            arr[0] = 1;
        } else if (num == 2) {
            arr[0] = 1;
            arr[1] = 1;
        } else if (num == 3) {
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 2;
        } else {
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 2;
            for (int i = 3; i < num; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        System.out.print(Arrays.toString(arr).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}

