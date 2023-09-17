import java.util.Scanner;

public class Future_investment_value {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Present Value:");
        double p=in.nextInt();
        System.out.println("Enter Interest rate:");
        double r=in.nextInt();
        System.out.println("Enter number of compounding Period:");
        double n=in.nextInt();

        double ans=p*Math.pow((1+(r/100)),n);
        System.out.println("The future investment value is "+ ans);
    }
}
