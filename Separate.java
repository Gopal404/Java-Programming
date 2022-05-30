import java.util.Scanner;
public class Separate
{
    int x,r,i=0;
    int n[]= new int[5];
    void spt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number to Separete:");
        x=sc.nextInt();
        if(x>99)
        {
            while(x!=0)
            {
                r= x%10;
                x= x/10;
                /*System.out.println(r);

                At first I try to print the value in the loop,but it printed the remainder.
                So the number is printed in reverse order,,Then i take an array and store the remainder in 
                it,,then print the array in reverser order*/

                //Input the last digit in a arry
                n[i]=r;
                i++;
            }
            //Display the array in reverse order
            System.out.println("The Separate Form is:");
            for(i=i-1;i>=0;i--)
            {
                System.out.print(n[i]+",");
            }
        }
        else
        {
            System.out.println("Sorry,Two Digit No. Not Allowed");
        }
       
    }
    public static void main(String args[])
    {
        Separate obj=new Separate();
        obj.spt();
    }
}