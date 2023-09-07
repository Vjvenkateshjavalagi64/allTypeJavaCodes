package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	printPrimeNumber(n);
	scan.close();
	}
	
	
	public static void printPrimeNumber(int n)
	{
	
		int numbers=1;
		for(int i=0;i<n;)
		{
			numbers++;
			int res=checkPrime(numbers);		
			if(res==1)
			{
				System.out.print(numbers+" ");
				i++;
			}
			
		}
	}
	public static int checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return 0;				
			}
		}
		return 1;
	}
}
