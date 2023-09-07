
public class StaticBlock {
	
	
	public static void print()
	{
		System.out.println("I Got Called by static block");
		System.out.println("I am calling now infiniteCall");
		infiniteCall();
	}
	
	
	
	static void infiniteCall()
	{
		int count=0;
		while(count!=10)
		{
			System.out.println("Hacked!<3");
			count++;
		}
	}
	
	
	
	static {
		System.out.println("This one is the static block");
		print();
	}
	public static void main(String[] args) {
		
	}

}
