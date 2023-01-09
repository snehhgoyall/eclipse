package OopConcepts;
import java.util.*;

class Account{
	public String name;
	protected String email;
	private String password;//will not be accessed by AccessModifiers class
	//here the concept of getters and setters works
	
	
	public void setPassword() {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Set your password in alphabet-");
	    String pass=sc.nextLine();//showing error like this
	    this.password=pass;
	    //private void setPassword(String pass) {
	    //	this.password=pass;
	    }
    public String getPassword() {
		//setPassword(randompass);this 
		return this.password;
	}
}

public class AccessModifiers {
	public static void main(String[] args) {
      
	   Account account1=new Account();
	   account1.name="Costumer";
	   account1.email="snehagoyal726@gmail.com";
	  
	  
	   account1.setPassword();
	   System.out.println(account1.getPassword());
	  }
}
