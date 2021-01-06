package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;
        int maxCount = 0;
        StringBuilder sequence = new StringBuilder();
        StringBuilder maxSequence = new StringBuilder();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                if (count == 0) {
                    count++;
                    sequence.append(arr[i]).append(" ").append(arr[i + 1]).append(" ");
                } else {
                    count++;
                    sequence.append(arr[i]).append(" ");
                }
            } else {
                count = 0;
                sequence = new StringBuilder();
            }
            if (count > maxCount) {
                maxSequence = sequence;
                maxCount = count;
            }
        }
        if (maxCount == 0) {
            maxSequence.append("1");
        }
        System.out.println(String.join(" ", maxSequence));
    }
}
