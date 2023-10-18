package single_inheritance;

public class BMW extends Vehicle{
	String color="White";
	
	public void showColor()
	{
		System.out.println("Color of BMW is "+color);
	}

public static void main(String[] args) {
		BMW car=new BMW();
		car.showVehicle();
		car.showColor();

	}
}
