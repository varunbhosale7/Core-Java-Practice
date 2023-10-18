package multilevel_inheritance;

public class BMW extends Car{
	String color="White";
	
	public void showColor()
	{
		System.out.println("Color of BMW is "+color);
	}

public static void main(String[] args) {
		BMW c=new BMW();
		
		c.showVehicle();
		c.showColor();
		c.showPrice();

	}
}
