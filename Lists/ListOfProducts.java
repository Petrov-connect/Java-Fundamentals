package Lists;
//created by J.M.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ListOfProducts {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<String> listOfProduct = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listOfProduct.add(scan.nextLine());
        }
        Collections.sort(listOfProduct);
        IntStream.range(0, listOfProduct.size()).forEach(i -> System.out.printf("%d.%s%n", i + 1, listOfProduct.get(i)));
    }
}
