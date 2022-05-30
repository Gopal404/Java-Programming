import java.util.Scanner;
class PrimeGen
{
    int s,e,i,j,f=0;
    public void Input()
    {
        System.out.println("Enter Starting Number:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        System.out.println("Enter Ending Number:");
        e=sc.nextInt();
    }
    public void Process()
    {
        if(s>=e)
        {
            System.out.println("Sorry,Invalid Input");
        }
        else
        {
            for(i=s;i<=e;i++)
            {   
                f=0;
                for(j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        f=1;
                    }
                }
                 if(f==0)
                {
                    System.out.print(i+"\t");
                }
            }

        }
    }
    public static void main(String args[])
    {
        PrimeGen obj=new PrimeGen();
        obj.Input();
        obj.Process();
    }
}