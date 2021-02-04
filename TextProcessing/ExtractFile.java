package TextProcessing;
//created by J.M.

import java.util.*;

public class ExtractFile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String file = input.substring(input.lastIndexOf("\\") + 1);

        System.out.printf("File name: %s%nFile extension: %s", file.substring(0, file.indexOf(".")), file.substring(file.indexOf(".") + 1));
    }
}
/*
        OR:
 String[]input=scan.nextLine().split("\\\\");
        String [] output=input[input.length-1].split("\\.");
        System.out.printf("File name: %s%nFile extension: %s",output[0],output[1]);
*/
