import java.util.Scanner;

class one3{
    public static void main(String args[])
    {
        Scanner sec = new Scanner(System.in);
        System.out.print("Name :");
        String name = sec.nextLine();
        System.out.print("Score :");
        double score = sec.nextDouble();
        sec.nextLine();
        System.out.print("Department :");
        String department = sec.nextLine();
        // int cgpa = score;
        System.out.println("My name is "+name);
        System.out.println("My scoer is "+score/10+"/10");
        System.out.println("My department is "+department);
    }
} 