import java.util.Scanner;

class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); //creating object of scanner class
		System.out.print("Enter a number to check prime or not : ");
		int num = sc.nextInt();//taking input from user
		
		int count = 0;
		for (int i = 1; i <= num ;i ++ )
		{
			if (num%i == 0)
			{
				count++;
			}
		}
		if (count == 2) // prime number has exactly 2 divisor
		{
			System.out.println(num+" is Prime Number");
		}
		else {
			System.out.println(num+" is Not Prime Number");
		}
	}
}
