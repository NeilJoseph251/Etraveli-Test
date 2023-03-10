import java.util.*;

public class Fibonacci {

	public static void fib(int n)
	{
		int a=1,b=1,c;
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		fib(n);
		
	}

}


//0 1 1 2 3 5 8