import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Neon Number : ");
		int num = sc.nextInt();
		
		int sqr = num*num;
		int sum = 0;
		for (int i = sqr ; i != 0 ; i/=10 )
		{
			sum +=i%10;
		}
			if (sum == num)
			{
				System.out.println(num+" is a Neon Number");
			}
			else System.out.println(num+" is Not a  Neon Number");
	}
}
