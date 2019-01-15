/* 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/

package pyramid;

public class prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int n=num;
		for(int i=1;i<=5;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			n--;
			System.out.println();
		}

	}

}
