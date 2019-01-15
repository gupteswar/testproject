/* 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/

package pyramid;

public class prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int n=num;
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}

	}

}
