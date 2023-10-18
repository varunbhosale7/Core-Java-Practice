package exceptionHandling;
//ArithmeticException
public class ExceptionExample1 {

	public static void main(String[] args) {
		 
		try {
		int data=100/0;  
	
		}
		catch(Exception e)
		{
		System.out.println(e);
		e.printStackTrace();
		}
		finally
		{
			System.out.println("finally Executed");
		}
	
	
	}

}
