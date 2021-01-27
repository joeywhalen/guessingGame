package guessingGame;

import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner userInput = new Scanner(System.in);
		int rand = 0;
		while (true) {
			rand = random.nextInt(11);
			if(rand !=0) break;
		}
		
		System.out.println("Guess a number between 1 and 10.");
		int guessRand = Integer.parseInt(userInput.nextLine());
		if (rand == guessRand) {
			System.out.println("Wow!");
		}	else {
			System.out.println("Nope!  The number was");
			System.out.println(rand);
		}
	}

}
