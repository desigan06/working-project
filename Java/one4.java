import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("number = ");
        int a = scan.nextInt();
        int b = a%3;
        int c = a%5;
        
        if( b==0 && c==0 )
        {
            System.out.print("Divisable by 3 & 5");
        }

        else{
            System.out.print("not divisable by 3 & 5");
        }
    }
}