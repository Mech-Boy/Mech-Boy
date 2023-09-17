import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int hcf=0;
        int lcm=0;
        for (int i = 1; i < a||i<b; i++) {
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("The HCF of the given number is:"+ hcf);
        lcm=(a*b)/hcf;
        System.out.println("The LCM of the given number is :"+ lcm);
    }
}
