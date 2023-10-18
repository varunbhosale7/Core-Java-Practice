package accessspecifiers;

public class ProtectedDemo {
	protected int num3=30;
	protected void n3()
	{
		System.out.println(num3);
	}
	public static void main(String[] args) {
		ProtectedDemo p=new ProtectedDemo();
		p.n3();
		System.out.println(p.num3);

	}

}
