import java.util.Scanner;
public class LastWord
{
    int i,lim;
    String s;
    char a[];
    public void Input()
    {
        System.out.println("Enter Any String:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
    }
    public void Process()
    {
        lim=s.length();
        a=new char[lim];
        for(i=0;i<=lim;i++)
        {
            a[i]=s.charAt(i);
        } 
        for(i=lim-1;i>=0;i--)
        {
            if(a[i]==' ')
            {
                break;
            }
        }
        for(i=i+1;i<=lim;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String args[])
    {
        LastWord obj=new LastWord();
        obj.Input();
        obj.Process();
    }
}