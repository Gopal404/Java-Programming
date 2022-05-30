import java.util.Scanner;

class Insert
{
    String s;
    void Input()
    {
        System.out.println("Enter Any String: ");
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
    }
    void Process()
    {
        char[] ch = s.toCharArray();
        System.out.println("<------- Vowels Are -------->");
        for( char i:ch)
        {
            if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u')
            {
                System.out.print(i+" ");
            }
            
        }
    }
}
class Vowel {
    public static void main(String[] args) {
        Insert ob= new Insert();
        ob.Input();
        ob.Process();
        
    }
}
