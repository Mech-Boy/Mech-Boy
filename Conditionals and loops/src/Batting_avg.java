import java.util.Scanner;

public class Batting_avg {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of runs Scored by the batsman:");
        double runs=in.nextInt();
        System.out.println("Enter the number of times batsman was out:");
        double out=in.nextInt();
        System.out.println("The batting Average of the batsman is "+ average(runs,out));
    }
    static double average(double runs,double out){
        return runs/out;
    }
}
