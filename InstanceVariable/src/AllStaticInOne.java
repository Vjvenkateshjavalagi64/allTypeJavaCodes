class First
{
	static String name;
	static int id;
	public static void print()
	{
		System.out.println("The first class name is:"+name);
		System.out.println(id);
	}
}

class Second{
	static String name;
	static int id;
	public static void print()
	{
		System.out.println("The second class name is:"+name);
		System.out.println(id);
	}
}

public class AllStaticInOne {
	
	static String name;
	static int id;
	static void print()
	{
		System.out.println("Within:"+name);
		System.out.println(id);
		
	}
	public static void main(String[] args) {
		First.name="Venkatesh";
		First.id=100;
		Second.id=200;
		Second.name="Srushti";
		First.print();
		Second.print();
		name="Harish";
		id=300;
		print();
	}

}
