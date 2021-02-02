package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class OrderByAge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Ordered> dataList = new ArrayList<>();
        String input;

        while (!"End".equals(input = scan.nextLine())) {
            String[] inputData = input.split(" ");
            Ordered data = new Ordered(inputData[0], inputData[1], Integer.parseInt(inputData[2]));
            dataList.add(data);
        }
        dataList.stream().sorted(Comparator.comparingDouble(Ordered::getAge)).forEach(data -> System.out.println(data.output()));
    }

    static class Ordered {
        String name;
        String id;
        int age;

        public Ordered(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String output() {
            return String.format("%s with ID: %s is %d years old.", getName(), getId(), getAge());
        }
    }
}
