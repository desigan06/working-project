import java.util.Scanner;

class Bankcustomer{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter your Account No : ");
        long no = get.nextLong();
        get.nextLine();
        System.out.print("Enter your Account Type : ");
        String type = get.nextLine();
        System.out.print("Enter your Amount :");
        int amount = get.nextInt();

        System.out.println("");
        System.out.println("Your Account details");
        System.out.println("");
        System.out.println("Account Number : "+no);
        System.out.println("Account Type : "+type);
        System.out.println("Balance Amount : "+amount);
    }
}