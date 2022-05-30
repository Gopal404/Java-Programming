import java.util.*;
public class pyramid
{
	public static void main(String args[])
		{
			Scanner obj=new Scanner(System.in);
			int i,j,k,l,m,lim;
			System.out.print("Enter The Limit:");
			lim=obj.nextInt();
			for(i=1;i<=lim;i++)
			{	
				
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				for(k=i;k<lim-1;k++)
				{
					System.out.print(" ");
				}
				for(l=i;l<=lim;l++)
				{
					System.out.print(" ");
				}
				for(m=1;m<=i;m++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
}