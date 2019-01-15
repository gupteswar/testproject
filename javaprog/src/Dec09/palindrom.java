package Dec09;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,rem,sum=0;
		System.out.println("enter a number");
		Scanner scan= new Scanner(System.in);
		number= scan.nextInt();
		int revno=number;
		while(revno!=0)
		{
			rem=revno%10;
			sum=(sum*10)+rem;
			revno=revno/10;
			
		}
		if(sum==number)
		{
			System.out.println("palindrom number");
		}
		else
		{
			System.out.println("number is not a palindrom number");
		}

	}

}
