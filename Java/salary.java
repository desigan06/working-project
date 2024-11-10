import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.print("What is your salary : ");
        int salary = get.nextInt();
        System.out.print("What is your age : ");
        int age = get.nextInt();
        System.out.print("Loan Amount : ");
        int amount = get.nextInt();

        if(age < 25 || salary >= 20000)
        {
            if(amount <= 50000)
            {
                System.out.print(" Your eligible for loan ");
            }

            else{
                System.out.print("Maximum loan amount is 50000");
            }
        }

        else{
            System.out.print("sl");
        }
    }
}