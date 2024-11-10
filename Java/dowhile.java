import java.util.Scanner;

class hello{
    public static void main(String arsg[])
    {
        Scanner get = new Scanner(System.in);

        int a = 0;

        do{
            System.out.print("a = ");
            a = get.nextInt();
            // System.out.println("Re enter the number!");
        }while(a<=10);
    }
}