package OopConcepts;

class Employee{
	int salary;
	String name;
	public int getSalary(){
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
	 name=n;
	}
}


public class Ques1 {

	public static void main(String[] args) {
	Employee sneha=new Employee();
	sneha.salary=12;
	//sneha.name="sneha";
	System.out.println(sneha.getSalary());
	//System.out.println(sneha.getName());
	sneha.setName("sneha");
	System.out.println(sneha.getName());
	}
}
