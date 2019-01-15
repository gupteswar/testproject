package Object_Class_Prog;

public class Use_To_String {
	String s1;
	Use_To_String()
	{
		
	}
	
	Use_To_String(String name)
	{
	this.s1=name;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use_To_String s=new Use_To_String();
		// super(s1.toString()); Object class toString() method executing Implicitly.
		System.out.println("s1="+s); 
		System.out.println("s1="+s.toString());
		Use_To_String s2=new Use_To_String("Syam");
		System.out.println("s1="+s2.toString());
		
	}

}
