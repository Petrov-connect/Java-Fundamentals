package MapsAndStreamAPI;
//created by J.M.

import java.util.*;
import java.util.Comparator;

public class LargesThreeNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).sorted(Comparator.reverseOrder()).limit(3).forEach(e -> System.out.print(e + " "));
    }
}
