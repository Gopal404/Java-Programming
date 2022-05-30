import java.util.*;
class Add
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		a=obj.nextInt();
		System.out.println("Enter 2nd Number:");
		b=obj.nextInt();
		c=a+b;
		System.out.println("Result is:"+c);
    }
}