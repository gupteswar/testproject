package Object_Class_Prog;

public class stringswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="java";
		String B="program";
		A=A+B;
		B=A.substring(0, A.length()-B.length());
		A=A.substring(B.length());
		System.out.println("value of A and B After Swap "+ A +" and "+B);

	}

}
