package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;

public class MagicCards {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> cardList = Arrays.stream(scan.nextLine().split(":")).collect(Collectors.toList());
        List<String> deckList = new ArrayList<>();
        String input;

        while (!"Ready".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0]) {
                case "Add":
                    if (cardList.contains(command[1])) {
                        deckList.add(cardList.get(cardList.indexOf(command[1])));
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Remove":
                    if (deckList.contains(command[1])) {
                        deckList.remove(command[1]);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Shuffle":
                    Collections.reverse(deckList);
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if ((cardList.contains(command[1])) && (index >= 0 && index <= deckList.size())) {
                        deckList.add(index, command[1]);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case "Swap":
                    Collections.swap(deckList, deckList.indexOf(command[1]), deckList.indexOf(command[2]));
                    break;
            }
        }
        System.out.println(String.join(" ", deckList));
    }
}
