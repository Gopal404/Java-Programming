import java.util.*;
public class Multi
{
    int n[][]=new int[3][3];
    int i,j;
    public void Accept()
    {
        System.out.println("Enter Values:");
        for(i=0;i<3;i++)
        {
            for(j=0;i<3;j++)
            {
                Scanner s=new Scanner(System.in);
                n[i][j]=s.nextInt();
            }
        }
    }
    public void Display()
    {
        for(i=2;i>=0;i--)
        {
            for(j=2;j>=0;j--)
            {
                System.out.print(n[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Multi obj=new Multi();
        obj.Accept();
        obj.Display();
    }

}