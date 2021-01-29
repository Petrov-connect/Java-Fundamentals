package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeckOfCards {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> list = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            List<String> commands = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
            switch (commands.get(0)) {
                case "Add":
                    if (list.contains(commands.get(1))) {
                        System.out.println("Card is already bought");
                    } else {
                        System.out.println("Card successfully bought");
                        list.add(commands.get(1));
                    }
                    break;
                case "Remove":
                    if (list.contains(commands.get(1))) {
                        list.remove(commands.get(1));
                        System.out.println("Card successfully sold");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    if (Integer.parseInt(commands.get(1)) > list.size() - 1 || Integer.parseInt(commands.get(1)) < 0) {
                        System.out.println("Index out of range");
                    } else {
                        System.out.println("Card successfully sold");
                        list.remove(Integer.parseInt(commands.get(1)));
                    }
                    break;
                case "Insert":
                    if (!(Integer.parseInt(commands.get(1)) > list.size() - 1 || Integer.parseInt(commands.get(1)) < 0)) {
                        if (!(list.contains(commands.get(2)))) {
                            System.out.println("Card successfully bought");
                            list.add(Integer.parseInt(commands.get(1)), commands.get(2));

                        } else {
                            System.out.println("Card is already bought");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
            }
        }
        IntStream.range(0, list.size()).forEach(i -> {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        });
    }
}
