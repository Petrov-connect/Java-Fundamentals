package Lists;
//created by J.M.
import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> numbers= Arrays.stream((scan.nextLine().split("\\s+"))).collect(Collectors.toList());

        String input;

        while (!"End".equals(input=scan.nextLine())){
            String[] command=input.split("\\s+");
            switch (command[0]){
                case"Add":
                    numbers.add(command[1]);
                    break;
                case"Insert":
                    try {
                        numbers.add(Integer.parseInt(command[2]), command[1]);
                    }catch (Exception exception){
                        System.out.println("Invalid index");
                    }
                    break;
                case"Remove":
                    try{
                        numbers.remove(Integer.parseInt(command[1]));
                    }catch (Exception exception){
                        System.out.println("Invalid index");
                    }
                    break;
                case"Shift":
                    if(command[1].equals("left")){
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            numbers.add(numbers.get(0));
                            numbers.remove(0);
                        }
                    }else{
                        for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                            numbers.add(0,numbers.get(numbers.size()-1));
                            numbers.remove(numbers.size()-1);
                        }
                    }
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", "").replaceAll(", ", " "));
    }
}
