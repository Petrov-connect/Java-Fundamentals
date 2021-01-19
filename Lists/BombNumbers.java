package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int bombIndex = scan.nextInt();
        int bombPower = scan.nextInt();

        while (numbers.contains(bombIndex)) {
            int endIndex = Math.min(numbers.indexOf(bombIndex) + bombPower, numbers.size() - 1);
            int startIndex = Math.max(0, numbers.indexOf(bombIndex) - bombPower);
            numbers.subList(startIndex, endIndex + 1).clear();
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
