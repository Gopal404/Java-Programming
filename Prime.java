import java.util.*;
class PCheck
{
    void PList(int n)
    {
        int i,j,flag=0;
        for(i=2;i<=n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if (flag==0)
            {
                System.out.println(j);
            }
            flag=0;         
        }
    }
}
public class Prime
{
    public static void main(String[] args)
    {
        PCheck obj=new PCheck();
        int n;
        System.out.println("Enter the limit: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        obj.PList(n);
        sc.close();

    }    
}
