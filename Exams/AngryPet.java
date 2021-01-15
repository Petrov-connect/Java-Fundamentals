package Exams;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AngryPet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scan.nextLine());
        String commandOne = scan.nextLine();
        String commandLast = scan.nextLine();

        int sumLeft;
        int sumRight;

        if (commandOne.equals("cheap")) {
            IntStream.range(0, numbers.size()).filter(i -> numbers.get(i) >= numbers.get(entryPoint)).forEach(i -> numbers.set(i, 0));
        } else {
            IntStream.range(0, numbers.size()).filter(i -> numbers.get(i) < numbers.get(entryPoint)).forEach(i -> numbers.set(i, 0));
        }
        if (commandLast.equals("positive")) {
            IntStream.range(0, numbers.size()).filter(i -> numbers.get(i) < 0).forEach(i -> numbers.set(i, 0));
        } else if (commandLast.equals("negative")) {
            IntStream.range(0, numbers.size()).filter(i -> numbers.get(i) > 0).forEach(i -> numbers.set(i, 0));
        }
        sumRight = IntStream.range(entryPoint + 1, numbers.size()).map(numbers::get).sum();
        sumLeft = IntStream.iterate(entryPoint - 1, i -> i >= 0, i -> i - 1).map(numbers::get).sum();
        if (sumLeft >= sumRight) {
            System.out.printf("Left - %d", sumLeft);
        } else {
            System.out.printf("Right - %d", sumRight);
        }
    }
}