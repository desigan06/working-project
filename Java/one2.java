import java.util.Scanner;

class one2{
    public static void main(String args[])
    {
        Scanner sec = new Scanner(System.in);
        System.out.print("a =");
        int a = sec.nextInt();
        System.out.print("b =");
        int b = sec.nextInt();
        System.out.print("c =");
        int c = sec.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.print( d/e);
    }
}