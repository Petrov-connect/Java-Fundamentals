package BasicSyntaxDataType;
//created by J.M.
import java.util.Scanner;

public class RefactoringPrimeChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int digit=Integer.parseInt(scan.nextLine());

        for(int i=2;i <=digit; i++){
            boolean prime= true; int count=0;
            for(int j=2; j<=digit; j++){
                if (i % j == 0) {
                    count++;
                }if(count>1){
                    prime=false;
                }
            }
            System.out.println(i+" -> "+prime);
        }
    }
}
