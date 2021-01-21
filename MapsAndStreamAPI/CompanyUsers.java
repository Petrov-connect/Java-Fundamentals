package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class CompanyUsers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> companies = new TreeMap<>();
        String input;

        while (!"End".equals(input = scan.nextLine())) {
            String[] command = input.split(" -> ");
            companies.putIfAbsent(command[0], new ArrayList<>());
            if (!companies.get(command[0]).contains(command[1])) {
                companies.get(command[0]).add(command[1]);
            }
        }
        companies.forEach((key, value) -> {
            System.out.println(key);
            value.forEach(id -> System.out.printf("-- %s%n", id));
        });
    }
}
