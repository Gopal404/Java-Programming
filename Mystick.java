import java.util.Scanner;
public class Mystick
{
    int x,r,z,s;
    void mst()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number to Check:");
        x=sc.nextInt();
        while(x!=0)
        {
            r= x%10;
            z= z+r;
            x= x/10;
        }
        if(z>9)
        {
            while(z>0)
            {
                r= z%10;
                s= s+r;
                z= z/10;
            }
            if(s==3)
            {
              System.out.println("Mystick No.");
            }
            else
            {
                System.out.println("Not a Mystick No.");
            }
        }
        else
        {
            if(z==3)
            {
                System.out.println("Mystick No.");
            }
            else
            {
                System.out.println("Not a Mystick No.");
            }
        }
    }
    public static void main(String args[])
    {
        Mystick obj=new Mystick();
        obj.mst();
    }
}