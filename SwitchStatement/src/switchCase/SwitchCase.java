package switchCase;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to activate any of the case:");
		int v=sc.nextInt();
		sc.close();
		switch(v)
		{
		case 1:System.out.println("selected 1st case");
		break;
		case 2:System.out.println("selected 2nd case");
		break;
		case 3:System.out.println("selected 3rd case");
		break;
		case 4:System.out.println("selected 4th case");
		break;
		case 5:System.out.println("selected 5th case");
		break;
		default:System.out.println("Invalid choice!");
		
		}
	}

}
