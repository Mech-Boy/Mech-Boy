import java.util.Scanner;

public class ReversIntString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        long num=in.nextInt();
        long temp=0;
        long ans=0;


        while (num>0){
            temp=num%10;
            num=num/10;

            ans=ans*10+temp;

        }
        System.out.println(ans);


    }
    }

