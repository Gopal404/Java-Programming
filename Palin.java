import java.util.Scanner;
public class Palin
{
    int n,r,s,res;
    public void Input()
    {
        System.out.println("Enter Any Number to Check:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    public void Process()
    {   
        s=n;
        while(n!=0)
        {
            r=n%10;
            res=(res*10)+r;
            n=n/10;
        }
        if(s==res)
        {
            System.out.println("Its Palindrome");
        }
        else
        {
            System.out.println("Its Not Palindrome");
        }

    }
    public static void main(String args[])
    {
        Palin obj= new Palin();
        obj.Input();
        obj.Process();
    }
}