package numberTable;

import java.util.Scanner;

public class SumOfN {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	calculateSum(n);
	sc.close();
}
public static void calculateSum(int n)
{
	int sum=0;
	for(int i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
	}
}
