import java.util.Scanner;
class fact
{
    void SwapV(int a,int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.print(b);
    }
}
class Swap
{                       
      public static void main(String args[])
    {
        fact obj = new fact();
        int n1,n2;
        System.out.print("Enter 1st Number: ");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        n2=sc.nextInt();
        obj.SwapV(n1,n2);
        sc.close();
    }   
}