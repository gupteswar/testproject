package BlackKnight;

public class findchar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "Arjuna Ranatunga";
		char c[] = Name.toCharArray();
	//	int len=Name.length();
		int len=c.length;
		int counter,i,j;
		for(i=0;i<len;i++)
		{
			
			counter=0;
			for(j=0;j<len;j++)
			{
				if(j<i && c[i]==c[j])
				{
					break;
				}
				if(c[i]==c[j])
				{
					counter++;
				}
				if(j == len-1)
				{
					System.out.println(c[i]+"="+counter);
				}
				}
			}
			
		}

	}


