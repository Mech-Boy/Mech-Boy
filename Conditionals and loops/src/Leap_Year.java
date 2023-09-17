import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int a=in.nextInt();
        if(a%4==0){
            System.out.println("The give year is leap Year");
        }else {
            System.out.println("The give year is  NOT leap Year");
        }
    }
}
