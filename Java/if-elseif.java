import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the Score :");
        int score = scan.nextInt();

        if(score >= 35 && score <60)
        {
            System.out.print("You can get Video game");
        }

        else if (score >= 60 && score <90) {
            System.out.print("You can get Iphone");
        }

        else if( score >= 90)
        {
            System.out.print("You can get MacBook Pro");
        }

        else{
            System.out.print("Your fail Nothing to you");
        }
    }
}