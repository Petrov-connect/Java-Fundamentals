package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayModifier {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> array = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!"end".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "swap":
                    int swapIndex1 = Integer.parseInt(command[1]);
                    int swapIndex2 = Integer.parseInt(command[2]);
                    Collections.swap(array, swapIndex1, swapIndex2);
                    break;
                case "multiply":
                    int firstIndex = Integer.parseInt(command[1]);
                    int secondIndex = Integer.parseInt(command[2]);
                    array.set(firstIndex, array.get(firstIndex) * array.get(secondIndex));
                    break;
                case "decrease":
                    IntStream.range(0, array.size()).forEach(i -> array.set(i, array.get(i) - 1));
                    break;
            }
        }
        System.out.print(Arrays.toString(new List[]{array}).replaceAll("[\\[\\]]", ""));
    }
}
