package MethodOverloading;

import java.util.Scanner;

public class D4_Same {
	
	class Venku{  
		  static void sum(int a,long b)
		  {
			  
			  System.out.println("a method invoked");
		  
		  }
		  static void sum(long a,int b)
		  {
			  System.out.println("b method invoked");
	      }  
	}
		  
		  static void venkatesh()
		  {
			  System.out.println("My name is venkatesh");
		  }
		  
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the values: ");
	int x=sc.nextInt();
	long y=sc.nextLong();
	

	
	Venku.sum(x,y);
	 Venku.sum(y,x);
	venkatesh();
	sc.close();
	
}
}
