package BlackKnight;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			getdata();
			System.out.println("one");
		}
		catch(Exception e)
		{
			System.out.println("Two");
		}
		finally
		{
			System.out.println("three");
		}
		
	}
	public static void getdata() throws Exception
	{
		 throw new Exception();
	}
	
	

}
