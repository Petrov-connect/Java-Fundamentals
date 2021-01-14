package BasicSyntaxDataType;
//created by J.M.
import java.util.Scanner;

public class WaterOverflow {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());

        int capacity=255;

        for(int i=1; i<=n; i++){
            int liters=Integer.parseInt(scan.nextLine());
            if(liters>capacity){
                System.out.println("Insufficient capacity!");
            }else{
                capacity-=liters;
            }
        }
        System.out.println(255-capacity);
    }
}
