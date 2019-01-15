package Dec02;

import java.io.IOException;

public class Exceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
