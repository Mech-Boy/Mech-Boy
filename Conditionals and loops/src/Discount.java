import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the price of the product:");
        double org=in.nextInt();
        System.out.println("Enter the price after discount:");
        double dis=in.nextInt();
        System.out.println("The discount on the original price is:"+ diss(org ,dis)+"%");
    }
    static double diss(double org,double dis){
        double price=0;
        price=100*((org-dis)/org);
        return price;

    }
}
