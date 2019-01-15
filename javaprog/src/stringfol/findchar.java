package stringfol;

import java.util.Scanner;

public class findchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a string too reverse");
Scanner scan= new Scanner(System.in);
String s= scan.next();
int len=s.length();
String r="";
for(int i=len-1;i>=0;i--)
{
	r=r+s.charAt(i);
	System.out.print("reverse string is ="+s.charAt(i));
}
System.out.println();
System.out.println(r);


	}

}
