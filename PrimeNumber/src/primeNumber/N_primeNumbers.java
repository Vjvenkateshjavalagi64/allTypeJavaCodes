package primeNumber;

import java.util.Scanner;

public class N_primeNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		printPrime(num);
		scan.close();		
	}
	
	public static void printPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			int res=checkPrime(i);
			if(res==1)
			{
				System.out.print(i+" ");
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
