package javabasics;

public class MethodExample {
	public int calculate(int a,int b)
	{
		
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		
		MethodExample m=new MethodExample();
		int z= m.calculate(5, 5);
		System.out.println("Addition="+z);
		
		System.out.println("Addition="+m.calculate(10, 10));
	}

}
