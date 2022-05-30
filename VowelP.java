import java.util.*;
class Check
{
    String str,str2="";
    int i;
    void Insert()
    {
        System.out.print("Enter Any String: ");
        Scanner sc  = new Scanner(System.in);
        str=sc.nextLine();
    }
    void Process()
    {
        for(i=0;i<str.length();i++)
        {
            
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||
             str.charAt(i)=='u')
             {
                 break;
             }
             str2+=str.charAt(i);
        }
        for(i=i;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println(str2+"Ay");
    }
}
public class VowelP 
{
    public static void main(String args[])
    {
        Check obj = new Check();
        obj.Insert();
        obj.Process();
    }
}
