package MapsAndStreamAPI;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddOccurrences {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().toLowerCase().split("\\s+");

        Map<String, Integer> words = IntStream.range(0, input.length).boxed()
                .collect(Collectors.toMap(i -> input[i], i -> 1, Integer::sum, LinkedHashMap::new));
        List<String> output = words.entrySet().stream().filter(entry -> entry.getValue() % 2 == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(String.join(", ", output));
    }
}
