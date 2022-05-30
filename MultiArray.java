import java.util.Scanner;
class MultiArray
{
    int a[][];
    int i,j,r,c;
    public void Input()
    {
        System.out.print("Enter Value For Row: ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        System.out.print("Enter Value For Column:");
        c=sc.nextInt();
        a=new int[r][c];
        System.out.println("Enter "+(r*c)+" Values:");
         System.out.println("---------------------------");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Enter Value For ["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
    }
    public void Process()
    {
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        MultiArray obj= new MultiArray();
        obj.Input();
        obj.Process();
    }
}