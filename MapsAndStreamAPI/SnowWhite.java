package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class SnowWhite {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, Integer> dwarfsInfo = new LinkedHashMap<>();
        String input;

        while (!"Once upon a time".equals(input = scan.nextLine())) {
            String[] command = input.split(" <:> ");
            String nameAndColor = String.format("(%s) %s <->", command[1], command[0]);
            int physics = Integer.parseInt(command[2]);
            dwarfsInfo.putIfAbsent(nameAndColor, 0);
            if (dwarfsInfo.get(nameAndColor) < physics) {
                dwarfsInfo.put(nameAndColor, physics);
            }
        }
        Map<String, Integer> countColors = new HashMap<>();
        dwarfsInfo.forEach((key, value) -> {
            String[] color = key.split(" ");
            countColors.put(color[0], !countColors.containsKey(color[0]) ? 1 : countColors.get(color[0]) + 1);
        });
        dwarfsInfo.entrySet().stream().
                sorted((a, b) -> {
                    int sort = b.getValue().compareTo(a.getValue());
                    if (sort == 0) {
                        String[] colorOfA = a.getKey().split(" ");
                        String[] colorOfB = b.getKey().split(" ");
                        sort = countColors.get(colorOfB[0]).compareTo(countColors.get(colorOfA[0]));
                    }
                    return sort;
                })
                .forEach(e -> System.out.printf("%s %d%n", e.getKey(), e.getValue()));
    }
}


