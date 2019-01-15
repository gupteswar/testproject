package Interface;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> s1= new HashMap<String,String>();
		s1.put("400","gupteswar");
		s1.put("500","selenium");
		for(Map.Entry m: s1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		s1.putIfAbsent("600", "TestNg");
		for(Map.Entry m: s1.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
