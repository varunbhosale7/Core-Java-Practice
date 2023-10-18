package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Hello");
		arr.add("Welcome");
		//System.out.println(arr.get(1));
		
		
		//Access ArrayList using Iterator and While
		Iterator<String> itr1 = arr.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			
		}
		
		
		//Access ArrayList using for
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
			
		}
		
		//Access ArrayList using for each
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}
