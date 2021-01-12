package BasicSyntaxDataType;
//created by J.M.

import java.util.Scanner;

public class RefactorVolumeOfPyramid {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Length: ");
        double length = Double.parseDouble(scan.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scan.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scan.nextLine());

        double volume = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}
