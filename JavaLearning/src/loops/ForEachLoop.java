package loops;
//for loop, while loop, do while loop
public class ForEachLoop {

	public static void main(String[] args) {
		
		//eg1
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		
		//eg2
		String arr2[]= {"C++","Java","Python"};
		for(String i:arr2)
		{
			System.out.println(i+" ");
		}
	}

}
