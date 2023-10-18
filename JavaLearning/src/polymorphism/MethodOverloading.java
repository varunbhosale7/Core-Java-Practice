package polymorphism;


//Method Overloading
public class MethodOverloading {
	
	public void car()
	{
		System.out.println("Showing just car");
	}
	
	public void car(int speed)
	{
		System.out.println("Showing car speed:"+speed);
	}
	
	public void car(String color)
	{
		
		System.out.println("Showing car color:"+color);
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.car();
		m.car(100);
		m.car("White");

	}

}
