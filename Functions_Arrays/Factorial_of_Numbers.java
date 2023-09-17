package Functions_Arrays;

import java.util.Scanner;

public class Factorial_of_Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("The Factorial of a given numbers is :"+ Fact(num));
    }

    static int Fact(int num){
        int multi=1;
        for (int i = 1; i <=num ; i++) {
            multi=multi*i;

        }
        return multi;
    }
}
