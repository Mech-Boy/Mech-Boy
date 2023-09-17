import java.util.Scanner;

public class largestnumberofall {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();

        int max=0;
        while (i!=0){
            int j=in.nextInt();
            if(j!=0){
               if(j>max){
                   max=j;
               }

            }else {
                break;
            }
        }
        System.out.println(max);
    }
}
