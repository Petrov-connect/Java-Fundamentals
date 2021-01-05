package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] firstArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean equals = true;
        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (!(firstArray[i] == secondArray[i])) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                equals = false;
                break;
            } else {
                sum += firstArray[i];
            }
        }
        if (equals) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
