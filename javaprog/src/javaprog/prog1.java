package javaprog;

class x
{
	public void getx()
	{
	 System.out.println("getx class called");
	}
}
class y extends x
{
	public  void gety()
	{
		System.out.println("gety class called");
	}
	
}
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		x obj1 = new x();
		obj1.getx();
		y obj2 = new y();
		obj2.getx();
		obj2.gety();
		x obj3 = new y();
		obj3.getx();
	}

}
