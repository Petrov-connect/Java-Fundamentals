package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheFinalQuest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> message = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String input;

        while (!"Stop".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            switch (command[0].trim()) {
                case "Delete":
                    int indexToRemove = Integer.parseInt(command[1]) + 1;
                    if (indexToRemove >= 0 && indexToRemove < message.size()) {
                        message.remove(indexToRemove);
                    }
                    break;
                case "Swap":
                    if (message.contains(command[1]) && message.contains(command[2]))
                        Collections.swap(message, message.indexOf(command[1]), message.indexOf(command[2]));
                    break;
                case "Put":
                    int indexToPut = Integer.parseInt(command[2]) - 1;
                    if (indexToPut >= 0 && indexToPut <= message.size()) {
                        message.add(indexToPut, command[1]);
                    }
                    break;
                case "Sort":
                    Collections.sort(message);
                    Collections.reverse(message);
                    break;
                case "Replace":
                    IntStream.range(0, message.size()).filter(i -> message.get(i).equals(command[2]))
                            .forEach(i -> message.set(i, command[1]));
                    break;
            }
        }
        System.out.println(String.join(" ", message));
    }
}
