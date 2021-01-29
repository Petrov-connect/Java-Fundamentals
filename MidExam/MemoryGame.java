package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class MemoryGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> elements = Arrays.stream((scan.nextLine().split("\\s+"))).collect(Collectors.toList());
        String input;
        int moves = 0;

        while (!"end".equals(input = scan.nextLine())) {
            moves++;
            int[] index = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if ((index[0] == index[1]) || (index[0] < 0 || index[0] >= elements.size()) || (index[1] < 0 || index[1] >= elements.size())) {
                System.out.println("Invalid input! Adding additional elements to the board");
                elements.add(elements.size() / 2, "-" + moves + "a");
                elements.add(elements.size() / 2, "-" + moves + "a");
            } else {
                if (elements.get(index[0]).equals(elements.get(index[1]))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(index[0]));
                    elements.remove(Math.max(index[0], index[1]));
                    elements.remove(Math.min(index[0], index[1]));
                } else {
                    System.out.println("Try again!");
                }
                if (elements.isEmpty()) {
                    System.out.printf("You have won in %d turns!%n", moves);
                    return;
                }
            }
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", elements));
    }
}
