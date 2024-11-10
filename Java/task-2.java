import java.util.Scanner;
class hello {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name : ");
        String name = scan.nextLine();
        System.out.println("Welcome to My World " + name + "!");
    }
}
