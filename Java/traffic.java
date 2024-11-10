import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.print("What is the color of the Traffic light :");
        String color = get.nextLine();

        // boolean red = true;     
        // boolean yellow = true;
        // boolean green = true;

        

        if( color.equals( "red"))
        {
            System.out.print("Stop");
        }

        else if(color.equals( "yellow"))
        {
            System.out.print("Get Ready");
        }

        else if(color.equals( "green"))
        {
            System.out.print("Go");
        }

        else{
            System.out.print("See the traffic light!");
        }
    }
}