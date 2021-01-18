package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnonymousThreat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> list = Arrays.stream((scan.nextLine().split("\\s+"))).collect(Collectors.toList());
        String input;

        while (!"3:1".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0].toLowerCase()) {
                case "merge":
                    int startIndex = Math.max(0, Integer.parseInt(command[1]));
                    int endIndex = Math.min(list.size() - 1, Integer.parseInt(command[2]));
                    if (startIndex > list.size() - 1) {
                        startIndex = 0;
                    }
                    String concatenate = IntStream.rangeClosed(startIndex, endIndex).mapToObj(list::get)
                            .collect(Collectors.joining());
                    list.subList(startIndex, endIndex + 1).clear();
                    list.add(startIndex, concatenate);
                    break;

                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int pieces = Integer.parseInt(command[2]);
                    String divideData = list.get(index);
                    if (pieces <= divideData.length()) {
                        list.remove(index);
                        int piecesCount = divideData.length() / pieces;
                        String[] parts = new String[pieces];
                        IntStream.range(0, pieces).forEach(i -> {
                            parts[i] = divideData.substring(i * piecesCount, (i + 1) * piecesCount);
                            if (i == pieces - 1) {
                                parts[i] = divideData.substring(i * piecesCount);
                            }
                            list.add(index + i, parts[i]);
                        });
                    }
                    break;
            }
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", "").replaceAll(", ", " "));
    }
}
