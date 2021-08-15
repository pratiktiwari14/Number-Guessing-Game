import java.util.Scanner;

public class Game{
	public static void main(String[] args) {
		number_game g1=new number_game();
		System.out.println("Game Started");
		System.out.println("Computer has a number between 1 and 50");
		System.out.println("Now your Turn");
		int n=g1.number_game();
		//System.out.println("n is--"+n);
		
		System.out.println("Remember You have only 5 chance to win");
		System.out.println("Enter your guessed number");
		int totalNumberOfTrail=5;
		int numberOfTrail=totalNumberOfTrail;
		int input=-1; 
		Scanner sc=new Scanner(System.in);
		while(numberOfTrail!=0) {
			input=sc.nextInt();
			numberOfTrail--;
			if(input==n) {
				break;
			}
			if(input>n) {g1.islarger(input);}
			if(input<n) {g1.issmaller(input);}
		
			System.out.println("Remaining chance= "+numberOfTrail);
		}
			
		if(n==input) {
			g1.iscorrect(totalNumberOfTrail-numberOfTrail);	
		}
		else if(numberOfTrail==0) {
			System.out.println("Game Over:: remainng chance= "+ numberOfTrail);
			System.out.println("you Lost :: Correct number is "+n);
		}
	}
}
