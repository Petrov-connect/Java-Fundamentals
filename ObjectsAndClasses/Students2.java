package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class Students2 {

    static class Student {

        String firstName;

        public String getFirstName() {
            return firstName;
        }

        int age;

        public int getAge() {
            return age;
        }

        String lastName;

        public String getLastName() {
            return lastName;
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

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input;

        while (!"end".equals(input = scan.nextLine())) {
            String[] data = input.split(" ");
            Student useData = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
            if (IsStudentExisting(students, data[0], data[1])) {
                int index = getExistStudentIndex(students, data[0], data[1]);
                students.set(index, useData);
            } else {
                students.add(useData);
            }
        }
        String townName = scan.nextLine();
        for (Student student : students) {
            if (townName.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static int getExistStudentIndex(List<Student> students, String firstName, String lastName) {
        int index = students.size();
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index = students.indexOf(student);
            }
        }
        return index;
    }

    static boolean IsStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}
