package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
