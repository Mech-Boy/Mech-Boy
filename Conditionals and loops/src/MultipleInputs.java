import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=0;
        int sum=0;
//        int i=in.nextInt();
//        int sum=0;
//        while (i!=0){
//            int j=in.nextInt();
//            if(j!=0){
//                sum=sum+j;
//
//            }else {
//                break;
//            }
//        }
        do {
             i=in.nextInt();
            if(i!=0){
                sum=sum+i;
            }else {
                break;
            }
        }while (i!=0);
        System.out.println(sum);
    }
}
