package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> averageNumbers = input.stream().filter(e -> e > input.stream()
                .mapToDouble(Integer::doubleValue).average().orElse(0.0))
                .sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
        if (averageNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.print(Arrays.toString(new List[]{averageNumbers})
                    .replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
        }
    }
}



/*if (array.size() == 1) {
            array.remove(0);
        } */
/*else {
            double average = (double) (array.stream().reduce(0, Integer::sum)) / array.size();
            array.removeIf((Integer i) -> (i <= average));
            Collections.sort(array);
            Collections.reverse(array);
            if (array.size() > 5) {
                array.subList(5, array.size()).clear();
            }
        }*/