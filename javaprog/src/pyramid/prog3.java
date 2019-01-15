/*
      1 
     2 2 
    3 3 3 
   4 4 4 4 
  5 5 5 5 5 
 */

package pyramid;

import java.util.Scanner;

public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,sp,no,n;
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		no=scan.nextInt();
		n=no;
		for(i=1;i<=no;i++)
		{
			for(sp=1;sp<=n;sp++)
			{
				System.out.print(" ");
			}
			n--;
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
				

	}

}
