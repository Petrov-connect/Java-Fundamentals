package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class OpinionPoll {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            Person data = new Person(input[0], Integer.parseInt(input[1]));
            personList.add(data);
        }
        personList.stream().filter(data -> data.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(data -> System.out.println(data.output()));
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String output() {
            return String.format("%s - %s", getName(), getAge());
        }
    }
}
