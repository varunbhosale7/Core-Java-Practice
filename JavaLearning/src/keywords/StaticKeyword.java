package keywords;

public class StaticKeyword {

	static int a=10;
	static void print()
	{
		System.out.println("Print Method "+a);
	}
	static
	{
		System.out.println("Inside Static Block");
		a=100;
	}
	
	public static void main(String[] args) {
		
		System.out.println(StaticKeyword.a);
		StaticKeyword.print();
		

	}

}
