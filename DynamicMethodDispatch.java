package OopConcepts;

class Phone{
	public void call() {
		System.out.println("phone is calling...");
	}
	
	public void on() {
		System.out.println("phone is turning on...");
	}
	public void radio() {
		System.out.println("phone is playing radio...");
	}
	
}

class Smartphone extends Phone{
	//overriding method on from phone
	public void call() {
		System.out.println("Smartphone is calling...");
	}
	public void on() {
		System.out.println("Smartphone is turning on...");
	}
	public void calculate() {
		System.out.println("Smartphone is calculating...");
	}
	public void music() {
		System.out.println("Smartphone is playing music...");
	}
	
}

public class DynamicMethodDispatch {//smartphone is called phone also but phone is not called smartphone 
	//like that supar class cal form an object of subclass
	//but the functions which are not there in phone will not be executed even though they are there in smartphone.
    //all the fuctions of phone can be executed  even though if is it not there in Smartphone(coz smartphone extends phone)
	public static void main(String[] args) {
		Phone function=new Smartphone();
		//function.calculate();//not valid
		function.on();
		function.call();
		function.radio();
		

	}

}
