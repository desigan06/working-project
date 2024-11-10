import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.print("number 1 : ");
        int a = get.nextInt();
        System.out.print("number 2 : ");
        int b = get.nextInt();

        // String d = a + " is smaller then " +b;
        // String e =  a +" is greater then "  +b;


        // String c = a < b?"Number 1 is smaller then number 2" : "Number 1 is greater then number 2" ;

        String c = a < b? a+" is smaller then "+b : a+" is greater then "+b ;

        System.out.print(c);
    }
}