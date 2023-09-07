package numberTable;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		demoo(n);
		scan.close();
	}
public static void demoo(int n)
	{
	int mul=1;
	for(int i=1;i<=n;i++)
	{
		mul=mul*i;
	}
	System.out.println(mul);
	}
	
}
