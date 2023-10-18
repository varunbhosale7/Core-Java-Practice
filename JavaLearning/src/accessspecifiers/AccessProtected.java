package accessspecifiers;

public class AccessProtected {

	public static void main(String[] args) {
		ProtectedDemo p=new ProtectedDemo();
		p.n3();
		System.out.println(p.num3); //Accessed in another class

	}

}
