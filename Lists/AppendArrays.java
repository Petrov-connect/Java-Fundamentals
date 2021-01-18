package Lists;
//created by J.M.
import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> numbers=Arrays.stream((scan.nextLine().split("\\|"))).collect(Collectors.toList());
        Collections.reverse(numbers);

        StringBuilder output= new StringBuilder();

        for (String number : numbers) {
            output.append(number).append(" ");
        }
        System.out.println(output.toString().trim().replaceAll("\\s+"," "));
    }
}
