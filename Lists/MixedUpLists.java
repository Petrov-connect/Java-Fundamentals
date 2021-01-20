package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> finalList = new ArrayList<>();

        while (!(firstList.isEmpty() || secondList.isEmpty())) {
            finalList.add(firstList.get(0));
            finalList.add(secondList.get(secondList.size() - 1));
            firstList.remove(0);
            secondList.remove(secondList.size() - 1);
        }
        int min;
        int max;
        if (!firstList.isEmpty()) {
            min = Math.min(firstList.get(firstList.size() - 1), firstList.get(firstList.size() - 2));
            max = Math.max(firstList.get(firstList.size() - 1), firstList.get(firstList.size() - 2));
        } else {
            min = Math.min(secondList.get(0), secondList.get(1));
            max = Math.max(secondList.get(0), secondList.get(1));
        }
        for (int i = 0; i < finalList.size(); i++) {
            if (finalList.get(i) >= max || finalList.get(i) <= min) {
                finalList.remove(i);
                i--;
            }
        }
        Collections.sort(finalList);
        System.out.println(finalList.toString().replaceAll("[\\[\\],]", "")
                .replaceAll(", ", " "));
    }
}
