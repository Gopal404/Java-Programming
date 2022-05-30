import java.util.Scanner;
public class Bubble
{
    int n,c,i,r,num;
    int a[];
    public void Input()
    {
        System.out.println("Enter Any Integer:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        num=n;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        //System.out.println(c);
        a=new int[c];
        for(i=0;i<c;i++)
        {
            r=num%10;
            num=num/10;
            a[i]=r;
        }
    }
    public void Process()
    {   
        int temp;
        boolean flag=true;
        while(flag)
        {
        for(i=0;i<a.length-1;i++)
        {
            flag=false;
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                flag=true;
            }
        }
        }
    }
    public void Display()
    {
        for(i=0;i<c;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        System.out.flush();
        Bubble obj=new Bubble();
        obj.Input();
        
        System.out.println("After Bubble Sort:");
        obj.Process();
        obj.Display();
    }
}