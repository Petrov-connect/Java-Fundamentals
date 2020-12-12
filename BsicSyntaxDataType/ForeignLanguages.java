package BsicSyntaxDataType;
//created by J.M.
import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String languige;
        switch (country){
            case"England":
            case"USA":
                languige="English";
                break;
            case"Spain":
            case"Argentina":
            case"Mexico":
                languige="Spanish";
                break;
            default: languige="unknown"; break;
        }
        System.out.println(languige);
    }
}
