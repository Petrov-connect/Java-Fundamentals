package ObjectsAndClasses;
//created by J.M.

import java.util.*;

public class StudentsClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            Student data = new Student(input[0], input[1], Double.parseDouble(input[2]));
            studentList.add(data);
        }
        studentList.stream().sorted((data1, data2) -> Double.compare(data2.getGrade(), data1.getGrade()))
                .forEach(data -> System.out.println(data.output()));
    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        public String output() {
            return String.format("%s %s: %.2f", getFirstName(), getLastName(), getGrade());
        }
    }
}
