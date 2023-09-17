import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);



        while (true){
            System.out.println("Enter the operator:");
            char ch=in.next().trim().charAt(0);
            int ans=0;

            if(ch=='+' || ch=='-' || ch=='*'|| ch=='/'|| ch=='%'){
                System.out.println("Enter two numbers:");
                int num1=in.nextInt();
                int num2=in.nextInt();
                if(ch=='+'){
                    ans= num1+num2;

                }
                if(ch=='-'){
                    ans= num1-num2;

                }
                if(ch=='*'){
                    ans= num1*num2;
                }
                if(ch=='/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }else {
                        System.out.println("Can not divide by 0");

                    }
                }
                if(ch=='%'){
                    ans= num1%num2;
                }
            } else if (ch=='x'||ch=='X') {
                break;
            }else{
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);

        }

    }
}
