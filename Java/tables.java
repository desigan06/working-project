import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.print("Which table you want : ");
        int a = get.nextInt();

        for(int i=1;i<=10;i=i+1)
        {
            System.out.println(a+" X "+i+" = "+i*a);
        }
    }
}