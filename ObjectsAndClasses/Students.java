package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class Students {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input;

        while (!"end".equals(input = scan.nextLine())) {
            String[] data = input.split(" ");
            Student useData = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
            students.add(useData);
        }
        String townName = scan.nextLine();
        for (Student student : students) {
            if (townName.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    static class Student {
        String firstName;

        public String getFirstName() {
            return firstName;
        }

        String lastName;

        public String getLastName() {
            return lastName;
        }

        int age;

        public int getAge() {
            return age;
        }

        String hometown;

        public String getHometown() {
            return hometown;
        }

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
    }
}
