import java.util.Scanner;

public class ComissionPercentages {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the total price:");
        double price=in.nextDouble();
        System.out.println("Enter the commission Percentages:");
        double percentages=in.nextDouble();
        System.out.println("Your Commission over "+ price+" is "+ Commission(price,percentages));
    }
    static double Commission(double price,double per){
        return (per/100)*price;
    }
}
