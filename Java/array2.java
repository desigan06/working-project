import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        int[] marks = new int[5];

        for(int i=0;i<5;i=i+1)
        {
           marks[i] = get.nextInt();

        }

        for(int i=0;i<5;i=i+1)
        {
            System.out.print("Marks = ");
            System.out.println(marks[i]);
        }

       
    }
}