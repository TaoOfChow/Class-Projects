package code;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int playerChoice = 0;
		double computerChoice = 0;
		int wins = 0, losses = 0;
		int rocks = 1, papers = 1, scissors = 1;
		char repeat = 'n';
		
		do{
			System.out.println("========================================");
			System.out.println("\tWins:\t"+wins+"\tLosses:\t"+losses);
			System.out.println("========================================\n");
			System.out.println("Welcome to the Rock Paper Scissors Game!");
			System.out.println("========================================\n");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors\n");
			System.out.print("Make a choice:");
			
			playerChoice = input.nextInt();
			
			computerChoice = Math.random();
			if(computerChoice <= (double)rocks/(rocks+papers+scissors))
				computerChoice = 1;
			else if (computerChoice >= (1.0-(double)scissors/(rocks+papers+scissors)))
				computerChoice = 3;
			else
				computerChoice = 2;
			
			System.out.print("You chose ");
			if(playerChoice == 1){
				System.out.println("rock.");
				papers++;
			}
			else if(playerChoice == 2){
				System.out.println("paper.");
				scissors++;
			}
			else{
				System.out.println("scissors.");
				rocks++;
			}
			
			System.out.print("The Computer chose ");
			if(computerChoice == 1)
				System.out.println("rock.");
			else if(computerChoice == 2)
				System.out.println("paper.");
			else
				System.out.println("scissors.");
			
			if( (playerChoice == 1 && computerChoice == 3) || (playerChoice == 2 && computerChoice == 1) || (playerChoice == 3 && computerChoice == 2)){
				System.out.println("You won!");
				wins++;
			}
			else if(playerChoice == computerChoice)
				System.out.println("It was a tie!");
			else{
				System.out.println("You lose!");
				losses++;
			}
			
			System.out.println("Do you want to play again (y/n)?");
			repeat = input.next().charAt(0);  
			//A VERY Common question is how to input a char.  
			//This is how.
		}while(repeat != 'n');
		
		
	
		
	}

}
