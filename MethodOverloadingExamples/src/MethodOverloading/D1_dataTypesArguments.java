package MethodOverloading;

public class D1_dataTypesArguments {
	class Add{
		static int sum(int a,int b)
		{
			return (a+b);
		}
		static int sum(double a,double b)//arguments are double of type and return type is in int so error will occurs
		{
			double c=(a+b)*2;
			
			return (int) (c);//explicit type casting is done here
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(Add.sum(1,2));
		System.out.println(Add.sum(1.8, 1.3));
	}

}
