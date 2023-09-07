package MethodOverloading;

public class SimpleExample {
	
	class Sum
	{
		static void add(int a,int b)
		{
			System.out.println(a+b);
		}
		static void add(int a,int b,int c)
		{
			System.out.println(a+b+c);
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		Sum.add(1, 2);
		Sum.add(1, 2, 3);
	}

}
