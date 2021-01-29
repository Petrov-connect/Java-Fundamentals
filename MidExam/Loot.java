package MidExam;
//created by J.M.

import java.util.*;

public class Loot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] itemsText = scan.nextLine().split("\\|");
        List<String> items = new ArrayList<>(Arrays.asList(itemsText));
        String input;

        while (!"Yohoho!".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+", 2);
            if (command[0].equals("MidExam.Loot")) {
                Arrays.stream(command[1].split("\\s+")).filter(s -> !items.contains(s)).forEach(s -> items.add(0, s));
            } else if (command[0].equals("Drop") && (Integer.parseInt(command[1]) >= 0 && Integer.parseInt(command[1]) < items.size())) {
                items.add(items.remove(Integer.parseInt(command[1])));
            } else {
                List<String> stolen = new ArrayList<>();
                while (stolen.size() < Integer.parseInt(command[1]) && !items.isEmpty()) {
                    stolen.add(items.remove(items.size() - 1));
                }
                Collections.reverse(stolen);
                System.out.println(String.join(", ", stolen));
            }
        }
        if (items.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", items.stream().mapToDouble(String::length).average().orElse(0.00));
        }
    }
}
