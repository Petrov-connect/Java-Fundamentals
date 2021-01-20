package Lists;
//created by J.M.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Messaging {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String text = scan.nextLine();
        List<Character> textList = IntStream.range(0, text.length()).mapToObj(text::charAt).collect(Collectors.toList());

        StringBuilder output = new StringBuilder();

        for (int num : numbersList) {
            int index = 0;
            while (num > 0) {
                index += num % 10;
                num /= 10;
            }
            if (!(index < textList.size() - 1)) {
                index = (index % textList.size());
            }
            output.append(textList.get(index));
            textList.remove(index);
        }
        System.out.println(output);
    }
}
