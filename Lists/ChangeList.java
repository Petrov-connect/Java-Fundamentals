package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input;

        while (!"end".equals(input = scan.nextLine().toLowerCase())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "delete":
                    while (numbers.contains(Integer.parseInt(command[1]))) {
                        numbers.remove((Integer) Integer.parseInt(command[1]));
                    }
                    break;
                case "insert":
                    if (Integer.parseInt(command[2]) >= 0 && Integer.parseInt(command[2]) < numbers.size()) {
                        numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    }
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
