package exceptionHandling;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException  
		} catch (Exception e) {
			
			e.printStackTrace();
		}
//		finally
//		{
//			System.out.println("Finally Executed");
//		}

	}

}
