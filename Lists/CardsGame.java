package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class CardsGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!(first.isEmpty() || second.isEmpty())) {
            if (first.get(0) > second.get(0)) {
                first.add(first.get(0));
                first.add(second.get(0));
            } else if (first.get(0) < second.get(0)) {
                second.add(second.get(0));
                second.add(first.get(0));
            }
            first.remove(0);
            second.remove(0);
        }
        if (!first.isEmpty()) {
            System.out.println("First player wins! Sum: " + getSum(first));
        } else {
            System.out.println("Second player wins! Sum: " + getSum(second));
        }
    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
