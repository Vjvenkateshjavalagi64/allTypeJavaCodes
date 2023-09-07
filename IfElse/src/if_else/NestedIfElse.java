package if_else;

import java.util.Scanner;

public class NestedIfElse {
public static void main(String[] args) {
	System.out.println("Enter any three values for A,B,C");
	Scanner sc=new Scanner(System.in);
	int A=sc.nextInt();
	int B=sc.nextInt();
	int C=sc.nextInt();
	sc.close();
	
	if(A>B)
	{
		if(A>C)
		{
			System.out.println("A is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}
	else
	{
		if(B>C)
		{
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
	}
}
}
