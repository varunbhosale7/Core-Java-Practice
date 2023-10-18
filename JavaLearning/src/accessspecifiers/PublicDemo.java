package accessspecifiers;

public class PublicDemo {
	public int num1=10;
	public void n1()
	{
		System.out.println(num1);
	}
	public static void main(String args[])
	{
		PublicDemo p=new PublicDemo();
		System.out.println(p.num1);
		p.n1();
		
	}
}
