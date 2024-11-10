import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.print("a = ");
        int a = get.nextInt();
        System.out.print("b = ");
        int b = get.nextInt();
        System.out.print("difference = ");
        int c = get.nextInt();
       



        for(int i=a; i<=b; i=i+c)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            
        }
    }
}