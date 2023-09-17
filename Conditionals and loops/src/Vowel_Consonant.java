import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char chr=in.next().trim().charAt(0);
        if(chr=='e'||chr=='a'||chr=='i'||chr=='o'||chr=='u'){
            System.out.println("The following character is vowel");
        }else {
            System.out.println("The following character is Consonant");
        }
    }
}
