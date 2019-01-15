package BlackKnight;

public class largeandsmallno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={33,3,5,23};
		int min = a[0];
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
			if ( a[i]>max)

			{
				max=a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
