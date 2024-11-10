class hello{
    public static void main(String args[])
    {
        int a = 5;
        int original = a;

        int temp;
        int dig = 0
        
        ;
        int check = 0;
        int digit = 0;

        while (a>0) {
            
            
            digit++;
        }

        while (a>0) {
            temp = a%10;
            dig = Math.pow(temp,digit);
            check = check+(temp*temp*temp);
            a=a/10;
        }

        if(original==check)
        {
            System.out.print(original+" is an Amstrong");
        }

        else{
            System.out.println(original+" is not an Amstrong");
            System.out.print(dig);
        }
    }
}