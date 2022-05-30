import java.util.Scanner;
public class ArrayBig
{
    int a[];
    int i,n,temp,f=0;
    public void Input()
    {
        System.out.print("How Many Number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter "+n+" Number:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public void Process()
    {
        for(i=0;i<n;i++)
        {
           if(a[i]>a[0])
            {
                temp=a[i];
                f=1;
            }
        }
        if(f==0)
        {
            System.out.println("Biggest Number is: "+a[0]);
        }
        else
        {
            System.out.println("Biggest Number is: "+temp);
        }
    }
    public static void main(String args[])
    {
        ArrayBig obj=new ArrayBig();
        obj.Input();
        obj.Process();
    }
}