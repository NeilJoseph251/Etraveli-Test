import java.util.*;

public class MatrixTranspose 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows: ");
		int m = sc.nextInt();
		System.out.print("\nEnter no of columns: ");
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Enter Matrix: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)	//print transpose of matrix
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}
