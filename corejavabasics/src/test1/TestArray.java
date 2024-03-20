package test1;
import java.util.*;
public class TestArray {

	public static void main(String[] args)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sa.nextInt();
		int i;
		for(i=1;i<=1;i++)
		{
			if(i==1)
				for(int j=1;j<=n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		for(i=2;i<=4;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		if(i==5)
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
		System.out.println();
	}
}