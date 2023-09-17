import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Units:");
        int units=in.nextInt();
        int bill=0;

        if(units<=100){
            bill=units*10;
        } else if (units<=300) {
            bill=(100*10)+(units-100)*15;
        } else if (units>300) {
            bill=100*10+100*15+(units-300)*20;
        }
        System.out.println("Your electricity bill is: "+ bill);

    }
}
