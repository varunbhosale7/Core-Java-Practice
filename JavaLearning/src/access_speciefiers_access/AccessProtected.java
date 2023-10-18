package access_speciefiers_access;

import accessspecifiers.ProtectedDemo;

public class AccessProtected extends ProtectedDemo{

	public static void main(String[] args) {
		AccessProtected p=new AccessProtected();
		p.n3();
		System.out.println(p.num3); //Accessed in another package

	}

}
