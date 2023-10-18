package collectionpackage;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		 //Create a vector  
        Vector<String> vec = new Vector<String>();  
        //Adding elements using add() method of List  
        vec.add("Java");  
        vec.add("Python");  
        vec.add("C++");  
        vec.add("C");  
        //Adding elements using addElement() method of Vector  
        vec.addElement("C#");  
        vec.addElement("VB");  
     
          
        System.out.println("Elements are: "+vec);  

	}

}
