package polymorphism;

public class TestConstructorOverloading extends ConstructorOverloading1{
	
	TestConstructorOverloading()
	{
		super();
		
	}
	TestConstructorOverloading(int a)
	{
		super(a);
	}
	public static void main(String[] args) {
		TestConstructorOverloading c=new TestConstructorOverloading();
		TestConstructorOverloading c2=new TestConstructorOverloading(30);
	}

}
