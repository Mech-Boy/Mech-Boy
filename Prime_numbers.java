public class Prime_numbers {
    public static void main(String[] args) {
      int num=17;

        System.out.println(Prom(num));
    }
     static String Prom(int num){
        int i=2;
         while (i<num){
             if(num%i==0){
                 return "The give number is not prime number";
             }
             i++;

         }
         return "The give number is prime number";
     }
}
