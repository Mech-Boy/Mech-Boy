import java.util.Scanner;

public class depresiationCost {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the the depresiation cost:");
        double cost=in.nextInt();
        System.out.println("Enter the Residual Cost:");
        double res_cost=in.nextInt();
        System.out.println("Enter the useful lifespan of the product:");
        double life=in.nextInt();
        double ans=  depresiation(cost,res_cost,life);
        System.out.println("The depreciation cost of the item is :"+ ans);
    }
    static double depresiation(double cost,double res_cost, double life){
        return (cost-res_cost)/life;
    }
}
