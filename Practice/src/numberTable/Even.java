package numberTable;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 sc.close();
   printEvenNumber(n);
  
   
	
	}
	public static void printEvenNumber(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	

}
