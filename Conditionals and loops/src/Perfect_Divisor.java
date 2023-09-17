import java.util.Scanner;

public class Perfect_Divisor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int a=in.nextInt();
        int sum=0;
        for (int i = 1; i <a ; i++) {
            if(a%i==0){
                sum=sum+i;
            }
        }
        if (a==sum){
            System.out.println("The given number is perfect Number.");
        }   else {
            System.out.println("The given number is not a perfect number.");
        }
    }
}
