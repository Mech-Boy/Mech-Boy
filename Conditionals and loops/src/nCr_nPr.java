import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the values of n and r :");
        long n=in.nextInt();
        long r=in.nextInt();
        System.out.println("The nCr of the give values is:"+ ncr(n,r));
        System.out.println("The nPr of the give values is:"+ npr(n,r));
    }
    static long ncr(long n,long r){
        return par(n)/(par(r)*par(n-r));
    }
    static long npr(long n,long r){
        return par(n)/par(n-r);
    }
    static long par(long a){

        long result=1;
        for (int c = 1; c <=a ; c++) {
            result=result*c;
        }
       return result;
    }
}
