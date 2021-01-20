package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class TrainList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int countOfPassenger = Integer.parseInt(scan.nextLine());

        String input;

        while (!"end".equals(input = scan.nextLine().toLowerCase())) {
            try {
                int num = Integer.parseInt(input);
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) + num <= countOfPassenger) {
                        numbers.set(i, numbers.get(i) + num);
                        break;
                    }
                }
            } catch (Exception ex) {
                String[] command = input.split(" ");
                numbers.add(Integer.parseInt(command[1]));
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", "").replaceAll(", ", " "));
    }
}
