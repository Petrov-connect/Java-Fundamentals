package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        int bestSequenceSum = 0;
        int bestSequenceIndex = 0;
        int count = 0;
        int sequenceIndex = length;
        int[] dnaSequence = new int[length];

        while (!input.equals("Clone them!")) {
            int[] arr = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            int index = length;
            count++;
            for (int i = 0; i < arr.length; i++) {
                if ((i != arr.length - 1) && arr[i] == 1 && arr[i + 1] == 1 && index == length) {
                    index = i;
                }
                sum += arr[i];
            }
            if (index == sequenceIndex && sum > bestSequenceSum) {
                dnaSequence = arr;
                bestSequenceIndex = count;
                bestSequenceSum = sum;
                sequenceIndex = index;
            } else if (index < sequenceIndex) {
                dnaSequence = arr;
                bestSequenceIndex = count;
                bestSequenceSum = sum;
                sequenceIndex = index;
            }
            input = scan.nextLine();
        }
        if (bestSequenceSum == 0) {
            bestSequenceIndex = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        Arrays.stream(dnaSequence).mapToObj(value -> value + " ").forEach(System.out::print);
    }
}
