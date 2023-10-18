package exceptionHandling;
//NullPointerException
public class ExceptionExample2 {

	public static void main(String[] args) {
		try
		{
			String s=null;  
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
