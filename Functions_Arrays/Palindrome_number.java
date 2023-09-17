package Functions_Arrays;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=1215;
        int ans=pali(num);
        if (num==ans){
            System.out.println("The given number is palindrome Number");
        }  else {
            System.out.println("The given number is Not palindrome Number");
        }
    }
    static int pali(int num){
        int sum= 0;
        int temp=1;
        while (num>0){
             temp=num%10;
             sum=(sum*10)+temp;
             num=num/10;
        }
        return sum;
    }
}
