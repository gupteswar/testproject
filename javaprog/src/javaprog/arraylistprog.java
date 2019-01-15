package javaprog;

import java.awt.List;
import java.util.ArrayList;

public class arraylistprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList al= new ArrayList();
	/*	al.add("1");
		al.add("2.3");
		al.add("rakesh");
		System.out.println(al);*/
	for(int i=1;i<=5;i++)
	{
		al.add(i);
	}
	System.out.println("size is+ "+al.size());
	System.out.println("2nd value"+al.get(2));
	System.out.println("value is empty"+al.isEmpty());
	al.add(1,"rahul");
	al.add(2, 5);
	al.add(0,"Ganesh");
	al.add(3, 4.3);
	al.add(4,"c");
	
	System.out.println(al);

	}

}
