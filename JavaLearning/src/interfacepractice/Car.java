package interfacepractice;

public interface Car {
	 default void print1()
	 {
		 System.out.println("Car is running");
	 }
	 void print2();
}
