package OopConcepts;
import java.util.*;
 
class Square{
	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	public void parameter(){
		//int a1=4*a;
		System.out.println("parameter is-"+4*a);
	}
	public void area() {
		//int b1=a*a;
		System.out.println("area is-"+a*a);
	}
}
 

public class Ques3 {

	public static void main(String[] args) {
		
		
		System.out.print("enter radius-");
		// TODO Auto-generated method stub
		Square s=new Square();
		
	
		s.parameter();
		s.area();
		

	}

}
