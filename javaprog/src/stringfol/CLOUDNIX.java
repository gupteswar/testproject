package stringfol;

import java.util.Scanner;

public class CLOUDNIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sn,ln;
		System.out.println("Enter Two Numbers");
		Scanner scan= new Scanner(System.in);
		sn=scan.nextInt();
		ln=scan.nextInt();
		for(int i=sn;i<=ln;i++)
		{
			if(i%3==0 && i%7==0)
			{
				System.out.println("CLOUDNIX");
			}else if(i%3==0)
			{
				System.out.println("CLOUD");
			}else if(i%7==0)
			{
				System.out.println("NIX");
			}
			else
			{
			
			System.out.println(i);
			}
		}

	}

}
