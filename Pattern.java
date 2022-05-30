import java.util.Scanner;
public class Pattern
{
    int n,i,j,k,p,lim,s,s1,start,l,s2,g;
    int z,x,c,v,b,m,z1,z2,z3;
    public void Input()
    {
        System.out.println("Enter Any Number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        g=n;
        p=n+(n-1);
        lim=p-2;
        s1=n;
        System.out.print("\n");
    }
    public void Display()
    {   
        start=1;
        for(i=1;i<=n-1;i++)
        {
            s=n;
                 for(j=1;j<=i;j++)
                {
                    
                    System.out.print(s+" ");
                    s--;
                }
                    for(k=start;k<=lim;k++)
                    {
                        System.out.print(s1+" ");
                    }
                    s1--;
                    s2=s1;
                    s2++;
                    start=start+2;
                    for(l=1;l<=i;l++)
                    {
                        System.out.print(s2+" ");
                        s2++;
            
                    }
                 System.out.print("\n");
        }
        for(i=1;i<=n;i++)
                {
                    System.out.print(g+" ");
                    g--;
                }
                g=g+2;
                for(j=1;j<n;j++)
                {
                    System.out.print(g++ +" ");
        
                }
                System.out.print("\n");
    }
    public void Display2()
    {
        z1=2;
        z2=2;
        b=1;
         for(z=n;z>=2;z--)
        {
            s=n;
            
                 for(x=1;x<z;x++)
                {
                    
                    System.out.print(s+" ");
                    s--;
                }
                    for(c=1;c<=b;c++)
                    {
                        System.out.print(z1+" ");
                    }
                    z1++;
                    b=b+2;
                    z3=z2;
                    for(m=1;m<x;m++)
                    {
                        System.out.print(z3+" ");
                        z3++;
                    }
                    z2++;
                
                System.out.print("\n");
        }
    }
    public static void main(String args[])
    {
        Pattern obj=new Pattern();
        obj.Input();
        obj.Display();
        obj.Display2();
    }
}       