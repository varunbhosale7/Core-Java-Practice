package javabasics;

public class StringMethods {

	public static void main(String[] args) {
		String s="Sachin";    
		System.out.println(s.toUpperCase());//SACHIN    
		System.out.println(s.toLowerCase());//sachin    
		System.out.println(s);//no change in original
		boolean check3=s.equalsIgnoreCase("sachin");
		System.out.println("s equals sachin "+check3);
		
		String s1="  Sachin  ";    
		System.out.println(s1);//  Sachin      
		System.out.println(s1.trim());//Sachin    

		 String s2="Sachin";    
		 System.out.println(s2.startsWith("Sa"));//true    
		 System.out.println(s2.endsWith("n"));//true 
		 
		 System.out.println(s2.charAt(0));//S    
		 System.out.println(s2.charAt(3));//h    
		 
		 System.out.println("Length="+s2.length());//6    
		 
		 String s3=s2.intern();
		 System.out.println("After intern():"+s3);
		 
		 int a=10;    
		 String s4=String.valueOf(a);    
		 System.out.println(s4+" String");    
		 
		 String s5=s3.replace("Sachin", "Varun");
		 System.out.println(s5);
		 
		 boolean check=s5.equals("Varun");
		 System.out.println(check);
		 
	
		 
	}

}
