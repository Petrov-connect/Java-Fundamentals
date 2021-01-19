package Lists;
//created by J.M.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input;

        while (!("end").equals(input = scan.nextLine())) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    numbersList.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    numbersList.remove((Integer) Integer.parseInt(command[1]));
                    break;
                case "RemoveAt":
                    numbersList.remove(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    numbersList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;
            }
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", "")
                .replaceAll(", ", " "));
    }
}
