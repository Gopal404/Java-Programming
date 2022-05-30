import java.util.Scanner;
class Palin
{
    int i,j,flag=0;
    String PalinCheck(String a )
    {
        for(i=0,j=a.length()-1;i<a.length()/2;i++,j--)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                flag=1;
            }
        }
        if (flag==0)
        {
            return("Palindrome");
        }
        else
        {
            return("Not Palindrome");
        }
    }
}6

class PalinDemo
 {
    public static void main(String[] args) 
    {
        Palin obj = new Palin();
        String str1,str2;
        System.out.print("Enter Any String: ");
        Scanner sc = new Scanner(System.in);
        str1=sc.nextLine();
        str2=obj.PalinCheck(str1);
        System.out.println(str2);
        sc.close();
    }
}
