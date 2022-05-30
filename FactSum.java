import java.util.Scanner;
class Fact
{
    float Process(int n)
    {
        int i,j;
        float sum=0,f=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                f=f*j;
            }
            // System.out.print(f+" ");
            sum=sum+(1/f);
            f=1;
        }
        return sum;
    }
}
class FactSum
{
    public static void main(String args[])
    {
        int n;
        float sum;
        Fact obj = new Fact();
        System.out.print("Enter The Limit: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sum=obj.Process(n);
        System.out.print(sum);
    }
}