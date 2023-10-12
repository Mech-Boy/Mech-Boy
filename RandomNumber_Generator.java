import java.util.Random;
import java.util.Scanner;

public class RandomNumber_Generator {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner in= new Scanner(System.in);
        int max=100;
        int min=0;
        int rnum=random.nextInt(max-min+1)+min;
        int chance=5;

        System.out.println("You have to guess the number right and for that you have give 5 chances");
        while (chance>0){
            System.out.println("Enter a number:");
            int num=in.nextInt();
            if(num>rnum){
                System.out.println("Try Again! You guessed too high");
                System.out.println("You have "+ (chance-1)+ " Chances remaining ");
            } else if (num<rnum) {
                System.out.println("Try Again! You guessed too low");
                System.out.println("You have "+ (chance-1)+ " Chances remaining ");
            }else {
                System.out.println("You guessed it right!");
                System.out.println("You had "+ (chance-1)+ " Chances remaining ");
                break;
            }
            chance--;

        }


    }
}
