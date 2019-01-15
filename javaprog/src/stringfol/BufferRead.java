package stringfol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferRead {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader bufread= new BufferedReader(ins);
		System.out.println("Enter string");
		String s= bufread.readLine();
		System.out.println(s);
		System.out.println("Enter number");
		int n= Integer.parseInt(bufread.readLine());
		System.out.println(n);
		

	}

}
