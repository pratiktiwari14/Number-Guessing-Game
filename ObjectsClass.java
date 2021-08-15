import java.util.Random;
import java.util.Scanner;

class number_game {
	int n;
	int input;
	int count=-1;
	
	int number_game() {
		Random rand=new Random();
		n=rand.nextInt(50)+1;
		return n;
	}
	void iscorrect(int chance) {
		System.out.println(" Hurray!!! You won ");
		System.out.println(" you took " +chance+" chance to guess the correct Number");
	}
	void islarger(int num) {		
		System.out.println("Wrong!! Enter Smaller number than "+num);
	}	
	void issmaller(int num) {
		System.out.println("Wrong!! Enter larger number than "+num);
	}
}