/* Output
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 
*/

package pyramid;

import java.util.Scanner;

public class prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, m;
		System.out.println("Enter number");
		Scanner scan= new Scanner(System.in);
		int no=scan.nextInt();
		int n=no+1;
		for(i=1; i<=no; i++)
		{
		j=0;
		for(k=0; k<=no; k++)
		{
		m = ((i+j)%n);
		if(m > 0)
		System.out.print(" "+m);
		j++;
		}
			System.out.println();
		}

	}

}
