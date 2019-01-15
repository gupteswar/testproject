/* 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/

package pyramid;

public class prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		int n=num;
		for(int i=1;i<=5;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}

}
