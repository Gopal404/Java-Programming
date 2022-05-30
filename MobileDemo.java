import java.util.Scanner;
class Mobile
{
    char a2[]={'a','b','c'};
    char a3[]={'d','e','f'};
    char a4[]={'g','h','i'};
    char a5[]={'j','k','l'};
    char a6[]={'m','n','o'};
    char a7[]={'p','q','r','s'};
    char a8[]={'t','u','v'};
    char a9[]={'w','x','y','z'};
    char l[][];
    String n;
    int i,j;
    Scanner sc = new Scanner(System.in);
    void Insert()
    {
        System.out.println("Enter Digit:(2-4):");
        n=sc.nextLine();
    }
    void Process()
    {
        for(i=0;i<n.length();i++)
        {
            if(n.charAt(i)=='2')
            {
                l[i]=a2;
            }
            if(n.charAt(i)=='3')
            {
                l[i]=a3;
            }
            if(n.charAt(i)=='4')
            {
                l[i]=a4;
            }
            if(n.charAt(i)=='4')
            {
                l[i]=a5;
            }
            if(n.charAt(i)=='6')
            {
                l[i]=a6;
            }
            if(n.charAt(i)=='7')
            {
                l[i]=a7;
            }
            if(n.charAt(i)=='8')
            {
                l[i]=a8;
            }
            if(n.charAt(i)=='9')
            {
                l[i]=a9;
            }
        }
        for(i=0;i<l[0].length;i++)
        {
            for(j=0;j<l[1].length;j++)
            {
                System.out.print(l[i][j]+" ");
            }
        }
    }
}
class MobileDemo 
{
    public static void main(String[] args) 
    {
        Mobile ob=new Mobile();
        ob.Insert();
        ob.Process();
    }
}
