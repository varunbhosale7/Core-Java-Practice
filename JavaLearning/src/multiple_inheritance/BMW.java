package multiple_inheritance;

public class BMW extends Vehicle implements Car{

	String color="White";
	
	public void showColor()
	{
		System.out.println("Color of BMW is "+color);
	}
	
	public static void main(String[] args) {
		BMW b1=new BMW();
		b1.showColor();
		b1.showPrice();
		b1.showVehicle();

	}

}
