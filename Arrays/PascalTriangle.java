package Arrays;
//created by J.M.

import java.util.Scanner;
import java.util.stream.IntStream;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        long[] arr = new long[n];
        arr[0] = 1;

        for (int i = 0; i < n; i++) {
            IntStream.iterate(i, k -> k > 0, k -> k - 1).forEach(k -> arr[k] = arr[k - 1] + arr[k]);
            String[] output = new String[i + 1];
            IntStream.iterate(0, m -> m < output.length, k -> k + 1).forEach(m -> output[m] = String.valueOf(arr[m]));
            System.out.print("\n" + String.join(" ", output));
        }
    }
}
