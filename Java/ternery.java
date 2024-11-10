import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.print("What is the weather :");
        String weather = get.nextLine();

        String rain = weather.equals("rain")?"take" : "lefave";
        System.out.print(rain);
    }
}
