import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("number is ");
        int a = scan.nextInt();
        int b = a%2;

        if(b ==0)
        {
            System.out.print("Even");
        }

        else{
            System.out.print("Odd");
        }
    }
}