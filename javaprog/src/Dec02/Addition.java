package Dec02;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of A");
		a=scan.nextInt();
		System.out.println("Enter Value of B");
		b=scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a is "+a+" and value of b is "+b);

	}

}
