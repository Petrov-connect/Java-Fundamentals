package Arrays;
//created by J.M.

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugsTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int field = Integer.parseInt(sc.nextLine());
        String ladyBugsString = sc.nextLine();
        String commandString = sc.nextLine();

        int[] ladyBugs = new int[field];
        int[] index = Arrays.stream(ladyBugsString.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(index).filter(value -> value >= 0 && value < ladyBugs.length).forEach(value -> ladyBugs[value] = 1);

        while (!commandString.equals("end")) {
            String[] command = commandString.split(" ");
            int bugIndex = Integer.parseInt(command[0]);
            int flyLength = Integer.parseInt(command[2]);
            if (command[1].equals("left")) {
                flyLength *= (-1);
            }
            int newIndex = bugIndex + flyLength;
            if (bugIndex < 0 || bugIndex > ladyBugs.length - 1 || ladyBugs[bugIndex] != 1) {
                commandString = sc.nextLine();
                continue;
            }
            ladyBugs[bugIndex] = 0;
            while ((newIndex >= 0 && newIndex < ladyBugs.length) && (ladyBugs[newIndex] == 1)) {
                newIndex += flyLength;
            }
            if (newIndex >= 0 && newIndex < ladyBugs.length) {
                ladyBugs[newIndex] = 1;
            }
            commandString = sc.nextLine();
        }
        Arrays.stream(ladyBugs).mapToObj(ladyBug -> ladyBug + " ").forEach(System.out::print);
    }
}