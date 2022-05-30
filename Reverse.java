import java.util.*;
class StrRev
{
    String str,str2="";
    int i,len;
    void Insert()
    {
        System.out.print("Enter Any Strig: ");
        Scanner sc =  new Scanner(System.in);
        str=sc.nextLine();
    }
    void Process()
    {
        len=str.length();
        for(i=len-1;i>=0;i--)
        {
            str2+=str.charAt(i);
        }
        System.out.print(str2);
    }
}
public class Reverse 
{
    public static void main(String[] args) 
    {
        StrRev obj = new StrRev();
        obj.Insert();
        obj.Process();
    }
}
