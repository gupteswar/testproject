package BlackKnight;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=6.3;
		
		if(d-- >= 6)
		{
			System.out.println("one");
		}
		System.out.println(d);
		if(--d <= 5)
		{
			System.out.println(d);
			System.out.println("two");
		}
		if(d-- >=4)
		{
			System.out.println("Three");
		}
		else
		{
			System.out.println("Four");
		}

	}

}
