import java.util.Scanner;
class Check
{
    void Process(int n)
    {
        if (n==11 || n==12 || n==1)
        {
            System.out.print("Winter");
        }
        else if (n==2 || n==3)
        {
            System.out.print("Spring");
        }
        else if (n==4 || n==5 || n==6)
        {
            System.out.print("Summer");
        }
        else if (n==7 || n==8 || n==9)
        {
            System.out.print("Monsoon");
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
class Season
{
    public static void main(String args[])
    {
        int n;
        Check obj=new Check();
        System.out.print("Enter Month Number:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        obj.Process(n);
    }
}