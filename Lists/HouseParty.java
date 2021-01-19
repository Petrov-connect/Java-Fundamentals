package Lists;
//created by J.M.

import java.util.*;

public class HouseParty {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> nameList = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            if (input[2].equals("going!")) {
                if (nameList.contains(input[0])) {
                    System.out.printf("%s is already in the list!%n", input[0]);
                } else {
                    nameList.add(input[0]);
                }
            } else {
                if (!nameList.remove(input[0])) {
                    System.out.printf("%s is not in the list!%n", input[0]);
                }
            }
        }
        nameList.forEach(System.out::println);
    }
}
