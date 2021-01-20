package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size(); i++) {
            numbersList.removeIf(n -> n < 0);
        }
        if (numbersList.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbersList);
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", "")
                    .replaceAll(", ", " "));
        }
    }
}
