import java.util.Scanner;

class PrintData

{
	String name;
	int id;
	 PrintData(String name,int id)
	{
		this.name=name;
		this.id=id;
		System.out.println(name+"-->"+id);
		
	}
	
}

public class InstanceVariable {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			String name=sc.next();
			int id=sc.nextInt();
			new PrintData(name,id);	
		}
		new PrintData("Venkatesh javalagi",100);	
		
		
		
	}
	
}
