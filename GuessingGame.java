package code;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int guess = 0, target = 0, level = 5, highScore = 5, tries = 3;
		
		do
		{
			tries = 3;
			target = (int)(Math.random()*(level)+1);
			System.out.println(target);
			
				System.out.println("\n====================================");
				System.out.println("\tMax Score: \t" + highScore);
				System.out.println("====================================");
				
			do
			{	
				System.out.print("Please guess a number from 1 to " + level +"\n(0 to quit): ");
				guess = input.nextInt();
				tries--;
				
				if(guess == 0)
					break;
				
				if(guess == target){
					System.out.println("You Got It!");
					level++;
					if(level > highScore)
						highScore = level;
				}
				else{
					System.out.println("That's not it!");
				}
			}while(tries > 0 && guess!=target);
			
			if(guess == 0)
				System.out.println("Thanks for playing!");
			else if(guess != target){
				System.out.println("You Lose!");
				level--;
			}
		}while(guess != 0);
		
		

		
	}

}
