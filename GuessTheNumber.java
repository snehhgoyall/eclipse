package OopConcepts;
import java.util.Random;
import java.util.*;

class Game{;
	public int noOfGuesses=0;
	public int a1;
	public int a;
	public int num=10;
	
	
	public int getNoOfGuesses() {
		 return noOfGuesses;
	}
	
	public void setNoOfGuesses(int noOfGuesses){
		this.noOfGuesses=noOfGuesses;
		
	}
	
	Game(){
		Random rand=new Random();
		this.a1=rand.nextInt(100);
	}
	
    public void takeUserInput() {
	   Scanner sc=new Scanner(System.in);
	   a=sc.nextInt();
    }
	   
	boolean isCorrectNum(){
		noOfGuesses++;
		if(a==a1){
			System.out.println("your guess is correct");
			//System.out.println("your attempts are-"+getNoOfGuesses());
			System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",a1, noOfGuesses);
			return true;
		}
		else if(a<a1){
			System.out.format("your guess is low. guess again:)-");
		}
		else if(a>a1){
			System.out.format("your guess is high. guess again:)-");
		}
		return false;
	}
}
public class GuessTheNumber {
    public static void main(String[] args) {
		System.out.print("Guess a number-");
		Game g=new Game();
		boolean b=false;
		
		while(!b) {
		g.takeUserInput();
		//g.setNoOfGuesses();
		b=g.isCorrectNum();
		
		}
	}
}
		
		
		
			
/*
Create a class Game, which allows a user to play "Guess the Number" game once.
Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
*/
		 

	


