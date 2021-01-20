package Lists;
//created by J.M.

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        int count = 0;

        while (count < (numbers.size() - 1)) {
            if (numbers.get(count).equals(numbers.get(count + 1))) {
                numbers.set(count, numbers.get(count) + numbers.get(count + 1));
                numbers.remove(count + 1);
                count = 0;
            } else {
                count++;
            }
        }
        StringBuilder output = new StringBuilder();
        numbers.forEach(number -> output.append((new DecimalFormat("0.#")).format(number)).append(" "));
        System.out.println(output);
    }
}

