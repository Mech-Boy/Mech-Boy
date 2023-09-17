import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=in.nextInt();
        System.out.println("Enter the power of that number:");
        int power=in.nextInt();
        System.out.println("The ans is "+ Math.pow(num,power));
    }
}
