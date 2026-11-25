import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check SPY or not :");
		int num = sc.nextInt();
		int rem = 0;
		int sum =0;
		int prod = 1;
		
		for (int i = num ; i != 0 ;i/=10 )
		{
			rem = i%10;
			sum +=rem;
			prod *= rem;
		}
		if (sum == prod)
		{
			System.out.println(num+" IS SPY NUMBER");
		}
		else System.out.println(num+" IS NOT SPY NUMBER");
	}
}
