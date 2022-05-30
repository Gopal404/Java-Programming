import java.util.Scanner;
public class calculator
{
    int a,b,c;
    char op;
    public void Input()
    {
        System.out.print("Enter 1st Number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("Enter Oparator:");
        op=sc.next().charAt(0);
        System.out.print("Enter 2nd Number:");
        b=sc.nextInt();
    }
    public void Process()
    {
        switch(op)
        {
            case'+': c=a+b;
                     System.out.print("Addition is: "+c);
                     break;
            case'-': c=a-b;
                     System.out.print("Subtraction is: "+c);
                     break;
            case'*': c=a*b;
                     System.out.print("Multiplication is: "+c);
                     break;
            case'/': c=a/b;
                     System.out.print("Division is: "+c);
                     break;
            default: System.out.print("Sorry, Invalid Operator");

        }
    }
    public static void main(String args[])
    {
        calculator obj=new calculator();
        obj.Input();
        obj.Process();
    }
}