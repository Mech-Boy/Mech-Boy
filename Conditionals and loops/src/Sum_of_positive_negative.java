import java.util.Scanner;

public class Sum_of_positive_negative {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a numbers: ");
      int a=1;
      int negative=0;
        int even=0;
        int odd=0;
        do{
         a=in.nextInt();
         if(a<0){
             negative=negative+a;
         } else if (a>0 && a%2==0) {
             even=even+a;
         } else if (a>0 && a%2!=0) {
             odd=odd+a;
         }

        }while (a!=0);
        System.out.println("The sum of negative numbers is "+ negative);
        System.out.println("The sum of even numbers is "+ even);
        System.out.println("The sum of odd numbers is "+ odd);
    }
}
