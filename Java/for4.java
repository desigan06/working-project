class hello{
    public static void main(String args[])
    {

        
        for(int i=1;i<=100;i=i+1)
        {
            int a = i%3;
            int b = i%5;

            if(a==0 && b==0)
            {
                System.out.println(i);
            }

        }
    }
}