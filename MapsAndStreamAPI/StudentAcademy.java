package MapsAndStreamAPI;
//created by J.M.

import java.util.*;

public class StudentAcademy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> studentInformation = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentsName = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            studentInformation.putIfAbsent(studentsName, new ArrayList<>());
            studentInformation.get(studentsName).add(grade);
        }
        studentInformation.entrySet().stream().filter(e -> getAverage(e.getValue()) >= 4.50)
                .sorted((a, b) -> Double.compare(getAverage(b.getValue()), getAverage(a.getValue())))
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), getAverage(e.getValue())));
    }

    static double getAverage(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).average().orElseThrow();
    }
}
