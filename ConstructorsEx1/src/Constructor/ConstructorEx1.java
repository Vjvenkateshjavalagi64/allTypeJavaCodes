package Constructor;

public class ConstructorEx1 {
	String name;
	 int id;
	ConstructorEx1(String name,int id)
	{
		this.name=name;
		this.id=id;
		print(this.name,this.id);
	}
	public static void print(String name,int id)
	{
		System.out.println(name);
		System.out.println(id);
	}
	
	
	public static void main(String[] args) {
		new ConstructorEx1("Venkatesh",101);
		
		
	}

}
