import java.util.*;

public class MirrorInverse {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int i=0,j=n-1;
		while(i<=j)
		{
			if(a[i]==a[j])		//using two pointers, one from the front and the other from the back
			{					//to check if each corresponding element is equal
				i++;
				j--;
			}
			else
				break;
		}
		if(i>j)
		{
			System.out.println("The array is mirror inverse");
		}
		else
		{
			System.out.println("The array is not mirror inverse");
		}
	}

}
