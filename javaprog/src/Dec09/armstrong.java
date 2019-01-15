package Dec09;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=0,armno;
		System.out.println("enter armstrong number");
		Scanner scan = new Scanner(System.in);
		number=scan.nextInt();
		armno=number;
		int rem=0;
		while(armno!=0)
		{
			rem=armno%10;
			sum=sum +(rem*rem*rem);
			armno=armno/10;
			
		}
		if(sum==number)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}

	}

}
