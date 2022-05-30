import java.util.*;
public class addition
{
    int a,b,c;
    public void input()
    {
        System.out.println("Enter 1st Number:");
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter 2nd Number:");
        b=s.nextInt();
    }
    public void display()
    {
        c=a+b;
        System.out.println("Result is:"+c);
    }
    public static void main(String gopal[])
    {
        addition obj=new addition();
        obj.input();
        obj.display();
    }
}