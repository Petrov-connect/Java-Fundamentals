package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class SoftUniParking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> register = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            if (input[0].equals("register")) {
                if (!register.containsKey(input[1])) {
                    register.put(input[1], input[2]);
                    System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", register.get(input[1]));
                }
            } else {
                if (register.containsKey(input[1])) {
                    System.out.printf("%s unregistered successfully%n", input[1]);
                    register.remove(input[1]);
                } else {
                    System.out.printf("ERROR: user %s not found%n", input[1]);
                }
            }
        }
        register.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
