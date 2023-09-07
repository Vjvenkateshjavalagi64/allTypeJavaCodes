package MethodOverloading;

public class D3_Main_MethodOverloading {
	public static void main(String[] args) //This method will be executes by "JVM"
	{
		System.out.println("String[] args"); 
	}
	
	public static void main(String args) 
	{
		System.out.println("String args");
	}
	
	public static void main() 
	{
		System.out.println(); 
	}

}
