import java.util.Random;

class hello{
    public static void main(String args[])
    {
        Random ran = new Random();
        int i=0;
        while(i<=1)
        {
            i= ran.nextInt(100);
            System.out.println(i);
            
        }
    }
}