
import java.util.*;

public class NumberProblem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a  = new int[3];
		System.out.println("Enter 3 numbers: ");
		for(int i=0;i<3;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter number N: ");
		int n = sc.nextInt();
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=i;j<3;j++)
			{
				if(a[i]+a[j]==n)
					count++;
			}
		}
		if(a[0]+a[1]+a[2]==n)
			count++;
		System.out.println("No of ways: "+count);
		
	}

}