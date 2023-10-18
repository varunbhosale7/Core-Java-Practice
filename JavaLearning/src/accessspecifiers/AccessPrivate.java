package accessspecifiers;

public class AccessPrivate {

	public static void main(String[] args) {
		//PrivateDemo p=new PrivateDemo();
//		p.n2(); 
		//cannot access
//		System.out.println(p.num2);
		//cannot access
		
		GetterSetter gs=new GetterSetter();
		gs.setNumber(1000);
		System.out.println(gs.getNumber());
	}

}
