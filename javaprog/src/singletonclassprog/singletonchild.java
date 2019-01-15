package singletonclassprog;

public class singletonchild {
	private static singletonchild single_instance = null; 
	  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private singletonchild() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static singletonchild  getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new singletonchild(); 
  
        return single_instance; 
    } 

}
