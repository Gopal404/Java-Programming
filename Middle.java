import java.util.*;
public class Middle
{
    int i,sc=0,lim,mid,s=0;
    char ch[];
    String str;
    public void Accept()
    {
        System.out.println("Enter Any String: ");
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
    }
    public void Process()
    {
        lim=str.length();
        ch=new char[lim];
        for(i=0;i<lim;i++)
        {
            ch[i]=str.charAt(i);
        }
        for(i=0;i<lim;i++)
        {
            if(ch[i]==' ')
            {
                sc++;
            }
        }
        if(sc%2!=0)
        {
            System.out.println("There Is No Middle Word");
        }
        else
        {
            mid=sc/2;
            for(i=0;i<lim;i++)
            {   
                if(ch[i]==' ')
                {
                    s++;
                    if(s==mid)
                    {
                        break;
                    }
                }
            }
            for(i=i+1;i<lim;i++)
            {
                System.out.print(ch[i]);
                if(ch[i]==' ')
                {
                    break;
                }
            }
        
        }

    }
    public static void main(String args[])
    {
        Middle obj=new Middle();
        obj.Accept();
        obj.Process();
    }
}