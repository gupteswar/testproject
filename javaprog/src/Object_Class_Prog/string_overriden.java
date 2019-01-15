package Object_Class_Prog;

public class string_overriden {
	
	public String toString()
	{
		return "test";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(10);
		System.out.println(i);
		String s=new String("hello dude");
		System.out.println(s);
		string_overriden so=new string_overriden();
		System.out.println(so);
	}

}
