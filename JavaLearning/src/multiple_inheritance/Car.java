package multiple_inheritance;

public interface Car {
	int price=20000000;
	default void showPrice()
	{
		System.out.println("Price:"+price);
	}
}
