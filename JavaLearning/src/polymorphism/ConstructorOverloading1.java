package polymorphism;

public class ConstructorOverloading1 {
	
	public ConstructorOverloading1()
	{
		System.out.println("No Arguments");
	}
	public ConstructorOverloading1(int a)
	{
		System.out.println("With Argument "+a);
	}
	
	public static void main(String args[])
	{
		ConstructorOverloading1 c=new ConstructorOverloading1();
		
		ConstructorOverloading1 c2=new ConstructorOverloading1(20);
	}
}
