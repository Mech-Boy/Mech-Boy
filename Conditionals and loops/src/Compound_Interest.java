import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the initial Value :");
        double p=in.nextInt();
        System.out.println("Enter the rate of return:");
        double r=in.nextInt();
        System.out.println("Enter the No. of time Compounded annually:");
        double m=in.nextInt();
        System.out.println("Enter the no of year you want to get compound interest on:");
        double t=in.nextInt();
        System.out.println("The compound Interest for "+t + " years is "+ comp(p,r,m,t));
    }
    static double comp(double p,double r, double m, double t){


        return p * (Math.pow((1 + r/100), (t * m))) - p;
    }

}
