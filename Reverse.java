import java.util.*;
public class Reverse
{
  String name;
  int lim,i;
  char n[];
  public void Accept()
  {
    System.out.println("Enter Any String:");
    Scanner s=new Scanner(System.in);
    name=s.nextLine();
  }

  public void LenCount() 
  {
    lim= name.length();
    n=new char[lim];
  }
  public void RevPrint()
  {
    for(i=0;i<lim;i++)
    {
      n[i]=name.charAt(i);
    }
    for(i=lim-1;i>=0;i--)
    {
      System.out.print(n[i]);
    }
  }
  public static void main(String args[])
  {
    Reverse obj=new Reverse();
    obj.Accept();
    obj.LenCount();
    obj.RevPrint();
  }


}