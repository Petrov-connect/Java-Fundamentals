package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SoftUniCoursePlanning {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> coursesList = Arrays.stream((scan.nextLine().split(",+"))).collect(Collectors.toList());

        for (int i = 0; i < coursesList.size(); i++) {
            coursesList.set(i, coursesList.get(i).trim());
        }
        String input;
        while (!"course start".equals(input = scan.nextLine())) {
            String[] commands = input.split(":+");
            switch (commands[0]) {
                case "Add":
                    if (!coursesList.contains(commands[1])) {
                        coursesList.add(commands[1]);
                    }
                    break;
                case "Insert":
                    if (!coursesList.contains(commands[1]) &&
                            (Integer.parseInt(commands[2]) >= 0 && Integer.parseInt(commands[2]) < coursesList.size())) {
                        coursesList.add(Integer.parseInt(commands[2]), commands[1]);
                    }
                    break;
                case "Remove":
                    coursesList.remove(commands[1]);
                    coursesList.remove(commands[1] + "-Exercise");
                    break;
                case "Swap":
                    if (coursesList.contains(commands[1]) && coursesList.contains(commands[2])) {
                        int indexFirst = coursesList.indexOf(commands[1]);
                        int indexSecond = coursesList.indexOf(commands[2]);
                        coursesList.set(indexFirst, commands[2]);
                        coursesList.set(indexSecond, commands[1]);
                        if (coursesList.contains(commands[1] + "-Exercise")) {
                            coursesList.remove(commands[1] + "-Exercise");
                            coursesList.add(coursesList.indexOf(commands[1]) + 1, commands[1] + "-Exercise");
                        }
                        if (coursesList.contains(commands[2] + "-Exercise")) {
                            coursesList.remove(commands[2] + "-Exercise");
                            coursesList.add(coursesList.indexOf(commands[2]) + 1, commands[2] + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    if (coursesList.contains(commands[1]) && !coursesList.contains(commands[1] + "-Exercise")) {
                        coursesList.add(coursesList.indexOf(commands[1]) + 1, commands[1] + "-Exercise");
                    } else if (!coursesList.contains(commands[1])) {
                        coursesList.add(commands[1]);
                        coursesList.add(commands[1] + "-Exercise");
                    }
                    break;
            }
        }
        IntStream.range(0, coursesList.size()).forEach(i -> System.out.printf("%d.%s%n", i + 1, coursesList.get(i)));
    }
}
