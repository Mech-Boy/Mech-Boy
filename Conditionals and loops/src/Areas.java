import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter o for circle");
        System.out.println("Enter t for triangle");
        System.out.println("Enter r for rectangle");
        System.out.println("Enter i for isoscelas triangle");
        System.out.println("Enter p for parallelogram");
        char op=in.next().trim().charAt(0);
        if (op == 'o') {
            System.out.println("Enter the radius of the circle:");
            int radius=in.nextInt();
            double ans=3.14*radius*radius;
            System.out.println(ans);

        }
        if (op == 't') {
            System.out.println("Enter the base and height of triangle:");
            int base=in.nextInt();
            int hight=in.nextInt();
            double ans=base*hight*0.5;
            System.out.println(ans);

        }
        if (op == 'r') {
            System.out.println("Enter the length and height of rectangle:");
            int length=in.nextInt();
            int hight=in.nextInt();
            double ans=length*hight;
            System.out.println(ans);

        }
        if (op == 'i') {
            System.out.print("Enter the length of the base of the isosceles triangle: ");
            double base = in.nextDouble();

            // Input the length of the equal sides
            System.out.print("Enter the length of the equal sides of the isosceles triangle: ");
            double side = in.nextDouble();

            // Calculate the height using the Pythagorean theorem
            double height = Math.sqrt(side * side - (base * base) / 4);

            // Calculate the area
            double area = 0.5 * base * height;

            // Output the result
            System.out.println("The area of the isosceles triangle is: " + area);
            in.close();
        }
    }
}
