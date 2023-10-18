package javabasics;

public class ArrayBasics {

	public static void main(String[] args) {
		int a[]=new int[5];//declaration and instantiation  
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		//traversing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]); 
		
		//or
		
		int b[]={33,3,4,5};
		System.out.println();
		for(int i=0;i<b.length;i++)
		{	
			System.out.println(b[i]+" ");
			
			
		}
		//length of array
		System.out.println("Length of b array is "+b.length);
		

		//for each
		int arr[]={33,3,4,5};  
		//printing array using for-each loop  
		for(int i:arr) 
		{
			System.out.println(i);
		}
	}

}
