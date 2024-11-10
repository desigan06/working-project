import java.util.Scanner;

class two{
    public static void main(String args[])
    {
        Scanner sec = new Scanner(System.in);
        System.out.print("What is your name :");
        String name = sec.nextLine();
        System.out.print("What is your age :");
        int age = sec.nextInt();
        sec.nextLine();
        System.out.print("What is your addres :");
        String addres = sec.nextLine();
        System.out.println("My name is :" +name);
        System.out.println("My age is :"+age);
        System.out.print("My addres is :"+addres);
    }
}
