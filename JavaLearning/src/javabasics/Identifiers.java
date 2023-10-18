package javabasics;
//Identifiers are the name given to variables, classes, methods
public class Identifiers {

	public void square() //method name square is an identifier
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	//The main() is the starting point for JVM to start execution of a Java program. 
	//public is access specifier
	//static is a keyword, to call the main() method without creating an object. 
	//void return type tells the compiler that main() method does not return any value.
	//String[] args used to hold the command line arguments in the form of string values.
	{
		int num1=10;
		//variable name num1 is an identifier
		System.out.println(num1);
	}

	

}
