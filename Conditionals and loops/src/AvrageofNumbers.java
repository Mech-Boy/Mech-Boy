import java.util.Scanner;

public class AvrageofNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double n=in.nextInt();
        double sum=0;
         double avg=0;

        for (int i = 0; i < n; i++) {
            int j=in.nextInt();
            sum=sum+j;
        }
        avg=sum/n;
        System.out.println("The average of "+n +" numbers is "+ avg);
    }
}
