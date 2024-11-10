
import java.util.Scanner;

class hello {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the side length of the square : ");
        double sideL = scan.nextDouble();
        double area = sideL * sideL;
        double perimeter = 4 * sideL;

        System.out.println("Area of the square : "+ area);
        System.out.println("Perimeter of the square : "+ perimeter);

    }
}
