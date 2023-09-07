//SAME DATA TYPES BUT CHANG IN ARGUMENTS
package MethodOverloading;

public class D2_methodOverloading {
	class Add
	    {
		static int sum(int a,int b) {
			return(a+b);
		}
		
		/*
		 * static double sum(int a,int b)
		 *  {
		 *   return(a+b);
		 *  }
		 * this block shows the error bcz the both arguments from 1st method and 2nd method are same. 
		 */
		 
        static double sum(int a,int b,int c) {
			
			return(a+b+c);   
			}
        
        
		static double sum(double a,int b) {
			
			return(a+b);   // this executes successfully bcz we have changed the argument type of 1st arguments
		}
}
	
	
	
	public static void main(String[] args) {
		System.out.println(Add.sum(1,20));
		System.out.println(Add.sum(1,20,4));
		System.out.println(Add.sum(1.5,20));
		
	}
}
