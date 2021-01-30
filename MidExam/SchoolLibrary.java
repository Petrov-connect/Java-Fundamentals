package MidExam;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SchoolLibrary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> bookList = Arrays.stream((scan.nextLine().split("&+"))).collect(Collectors.toList());
        IntStream.range(0, bookList.size()).forEach(i -> bookList.set(i, bookList.get(i).trim()));
        String input;

        while (!"Done".equals(input = scan.nextLine())) {
            String[] command = input.split("\\|");
            switch (command[0].trim()) {
                case "Add Book":
                    if (!bookList.contains(command[1].trim())) {
                        bookList.add(0, command[1].trim());
                    }
                    break;
                case "Take Book":
                    bookList.remove(command[1].trim());
                    break;
                case "Swap Books":
                    if (bookList.contains(command[1].trim()) && bookList.contains(command[2].trim())) {
                        Collections.swap(bookList, bookList.indexOf(command[1].trim()), bookList.indexOf(command[2].trim()));
                    }
                    break;
                case "Insert Book":
                    bookList.add(command[1].trim());
                    break;
                case "Check Book":
                    if (Integer.parseInt(command[1].trim()) >= 0 && Integer.parseInt(command[1].trim()) < bookList.size()) {
                        System.out.println(bookList.get(Integer.parseInt(command[1].trim())));
                    }
                    break;
            }
        }
        System.out.println(bookList.toString().replaceAll("[\\[\\]]", ""));
    }
}
