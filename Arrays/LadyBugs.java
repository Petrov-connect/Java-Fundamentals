package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LadyBugs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        int[] position = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(position).filter(value -> value >= 0 && value <= arr.length - 1).forEach(value -> arr[value] = 1);
        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] action = input.split(" ");
            int startPosition = Integer.parseInt(action[0]);
            int endPosition = Integer.parseInt(action[2]);
            if ((startPosition > arr.length - 1) || (startPosition < 0) || (arr[startPosition] != 1)) {
                input = scan.nextLine();
                continue;
            }
            arr[startPosition] = 0;
            if (action[1].equals("right")) {
                if (startPosition + endPosition > arr.length - 1) {
                    input = scan.nextLine();
                    continue;
                }
                IntStream.iterate(startPosition + endPosition, i -> i < arr.length, i -> i + endPosition).filter(i -> arr[i] != 1).findFirst().ifPresent(i -> arr[i] = 1);
            } else if (action[1].equals("left")) {
                if (startPosition - endPosition < 0) {
                    input = scan.nextLine();
                    continue;
                }
                IntStream.iterate(startPosition - endPosition, i -> i >= 0, i -> i - endPosition).filter(i -> arr[i] != 1).findFirst().ifPresent(i -> arr[i] = 1);
            }
            input = scan.nextLine();
        }
        Arrays.stream(arr).mapToObj(value -> value + " ").forEach(System.out::print);
    }
}
