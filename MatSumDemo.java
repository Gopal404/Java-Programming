import java.util.Scanner;
class MatSum
{
    int a[][],b[][],sum[][],i,j,r,c;
    Scanner sc= new Scanner(System.in);
    void getData()
    {
        System.out.print("Enter Row: ");
        r=sc.nextInt();
        System.out.print("Enter Column: ");
        c=sc.nextInt();

        a= new int[r][c];
        b= new int[r][c];
        sum= new int[r][c];

        System.out.println("Enter Values For Matrix A: ");
        for (i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Enter Values For ["+i+"] ["+j+"]: ");
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Values For Matrix B: ");
        for (i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print("Enter Values For ["+i+"] ["+j+"]: ");
                b[i][j]=sc.nextInt();
            }
        }   
    }
    void Process()
    {
        for (i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum is :");
        for (i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" "); 
            }
            System.out.println();
        }

    }
    
}
class MatSumDemo 
{
    public static void main(String args[])
    {
        MatSum ob = new MatSum();
        ob.getData();
        ob.Process();
    }
}
   
