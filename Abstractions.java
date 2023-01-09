package OopConcepts;//abstract class is defined but not implemented
abstract class Parent{
	abstract void on();
	abstract void on(int a);
	Parent(){
		System.out.println("hello");
	}
	abstract public void off();//nothing can be declared in it
}
class Child1 extends Parent{
	void on() {//overriding of abstract
		System.out.println("abstract class ko extend karne pe ya toh abstract method override karo ya class ko abstract declare laro");
	}
	void on(int a) {
		System.out.println("me on hu");//overloading in abstract
	}
	public void off() {
		System.out.println("me off hu");//agar vo public h toh yaha bhi public likho
	}
	
}

abstract class Child2 extends Parent{
	public int music() {
		return 4;
 }
}
	
public class Abstractions{
public static void main(String[] args) {
	//Parent obj=new Child2();//cant do this coz child2 is abstract
	Parent obj=new Child1();//can implement //cannot make abstract class ka object
	obj.off();
	Child1 obj2=new Child1();
	obj2.on();
}
}
	
 

