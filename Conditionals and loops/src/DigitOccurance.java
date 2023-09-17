import java.util.Scanner;

public class DigitOccurance {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        long num=in.nextInt();
        long target=in.nextInt();
        long temp=0;
        long count=0;

        while (num>0){
            temp=num%10;
            if(temp==target) {
                count ++;
            }
            num=num/10;

            }
        System.out.println(count);

        }
    }

