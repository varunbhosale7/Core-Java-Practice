package interfacepractice;

public class Audi implements Car {

 public static void main(String args[])
 {
	Car a=new Audi();
	a.print1();
	a.print2();
 }

@Override
public void print2() {
	System.out.println("Audi is Running");
	
}
}
