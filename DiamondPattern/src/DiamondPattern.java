	import java.util.Scanner;
	//DIAMOND PATTERN
	public class DiamondPattern {
		public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=scan.nextInt();
		scan.close();
		int k=1;
		for(int i=1;i<=n;i++)
		{
	          printer(i, n,k);
	          k++;
		}
		for(int i=n-1;i>=1;i--)
		{
			printer(i, n,k);
			k++;
		}
}
			
		public static void printer(int i,int n,int k)
		{ 
			
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("   ");
				
			}
			System.out.println();
			
		}

		
}