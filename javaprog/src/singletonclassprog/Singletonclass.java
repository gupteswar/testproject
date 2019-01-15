package singletonclassprog;


public class Singletonclass {

	public static void main(String[] args) {
		
		singletonchild x = singletonchild.getInstance();
		System.out.println(x.s);
		
	}

}
