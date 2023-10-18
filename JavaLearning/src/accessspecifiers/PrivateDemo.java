package accessspecifiers;

public class PrivateDemo {
	private int num2=20;
	private void n2()
	{
		System.out.println(num2);
	}
	public static void main(String[] args) {
		PrivateDemo p=new PrivateDemo();
		p.n2();
		System.out.println(p.num2);
		
	}

}
