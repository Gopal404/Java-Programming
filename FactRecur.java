import java.util.Scanner;
class fact
{
    int GetFact(int n)
    {
      if (n>=1)
      {
        return n*GetFact(n-1);              
      }
      else
      {
        return 1;          
      } 
    }
}
class FactRecur
{                       
      public static void main(String args[])
    {
        fact obj = new fact();
        int n,ob;
        System.out.print("Enter Any Number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        ob=obj.GetFact(n);
        System.out.println(ob);
        sc.close();
    }   
}