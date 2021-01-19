package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class CarRace {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double leftTime = 0;
        double rightTime = 0;
        int right = numbers.size() - 1;

        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) != 0) {
                leftTime += numbers.get(i);
            } else {
                leftTime *= 0.8;
            }
            if (numbers.get(right) != 0) {
                rightTime += numbers.get(right);
            } else {
                rightTime *= 0.8;
            }
            right--;
        }
        if (leftTime < rightTime) {
            System.out.printf("The winner is left with total time: %.1f", leftTime);
        } else {
            System.out.printf("The winner is right with total time: %.1f", rightTime);
        }
    }
}
