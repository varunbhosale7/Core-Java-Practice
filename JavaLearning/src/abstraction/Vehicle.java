package abstraction;

public class Vehicle extends Car{
 public static void main(String args[])
 {
	 
		Car c1=new Vehicle();
		c1.print();
		c1.showCar();
		
		
		Car c2=new BMW();
		c2.print();
		c2.showCar();
		
		BMW b1= new BMW();
		b1.showBMW();
		b1.showCar();
		
		Vehicle v1=new Vehicle();
		v1.showVehicle();
		v1.showCar();
		
	
 }

@Override
void print() {
	System.out.println("In Vehicle Class");
	
}

void showVehicle()
{
	System.out.println("In showVehicle()");

}
 

	

}
