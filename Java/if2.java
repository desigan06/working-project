import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.println("give a five subject marks ");
        System.out.print("Subject 1 : ");
        int sub1 = get.nextInt();
        System.out.print("Subject 2 : ");
        int sub2 = get.nextInt();
        System.out.print("Subject 3 : ");
        int sub3 = get.nextInt();
        System.out.print("Subject 4 : ");
        int sub4 = get.nextInt();
        System.out.print("Subject 5 : ");
        int sub5 = get.nextInt();

        int a = sub1 + sub2 + sub3 + sub4 + sub5;
        int b = a/5;

        System.out.println("Your average mark is "+b);
        
    if(b < 35){
        System.out.print("So your Additional class is required.");
    }

    else{
        System.out.print("Your are good to go , Keep it up!");
    }
    }
}