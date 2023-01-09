package OopConcepts;
class Cellphone{
	public void ring() {
		System.out.println("Ringing.....");
	}
	public void vibrate() {
		System.out.println("Vibrating....");
	}
	public void Call() {
		System.out.println("Calling....");
	}
}
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cellphone asus=new Cellphone();
		asus.ring();
		asus.vibrate();
		asus.Call();

	}

}
