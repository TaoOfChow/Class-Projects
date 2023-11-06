package code;

import java.util.Scanner;

public class BlackJack {

	
	/*This method populates the deck such that every card and suit are represented.
	 * In this case, we will use unicode values for the suits.  The card numbers are from 1
	 * to 13 where 1 is an ace, 11 is a jack, 12 is a queen, and 13 is a king.
	 */
	public static void populate(Card[] deck) {
		
	}
	
	/*This method randomizes the deck by shuffling the cards around.  This does NOT
	 * populate the deck randomly as that would create duplicate cards.
	 */
	public static void shuffle(Card[] deck) {

	}
	
	/*This method counts (and returns) the number of cards in the given hand.  This can be found because
	 * the original values of all the numbers is zero.  Thus, we can scan the array and count
	 * how many non-zero cards we have to know how many cards are in the hand.
	 */
	public static int numberOfCardsInHand(Card[] hand) {

	}
	
	
	/*This method takes the given hand and prints them horizontally with nice Unicode card graphics
	 * Example:
	  	┏━━━━┓┏━━━━┓┏━━━━┓
		┃7♥  ┃┃3♥  ┃┃10♠ ┃
		┃    ┃┃    ┃┃    ┃
		┃    ┃┃    ┃┃    ┃
		┗━━━━┛┗━━━━┛┗━━━━┛
		Example: 
		┏━━━━┓┏━━━━┓
		┃Q♥  ┃┃9♣  ┃
		┃    ┃┃    ┃
		┃    ┃┃    ┃
		┗━━━━┛┗━━━━┛
		
		Be careful as the 10 can make drawing the card tricky.
	 */
	public static void drawHand(Card[] hand) {
		
	}
	
	
	/*This method takes the given hand and prints them horizontally with nice Unicode card graphics.
	 * However, it will obscure the first card so that the player cannot see it.  This is used to
	 * hide the dealer's face down card at the beginning of the game.
	 * 
	 * Example:
	  	┏━━━━┓┏━━━━┓
		┃####┃┃J♣  ┃
		┃####┃┃    ┃
		┃####┃┃    ┃
		┗━━━━┛┗━━━━┛
		Example: 
		┏━━━━┓┏━━━━┓
		┃####┃┃8♣  ┃
		┃####┃┃    ┃
		┃####┃┃    ┃
		┗━━━━┛┗━━━━┛
		
	 */
	public static void drawHandWithHiddenFirstCard(Card[] hand) {
		
	}
	
	
	/* This method copies the Card in element [nextCardInDeck]from the deck to the hand.  
	 * Note that it does not remove the card from the deck.  Note also that you must find the
	 * first empty spot in the hand to copy to.
	 */
	public static void dealNextCard(Card[] deck, int nextCardInDeck, Card[] hand) {
		
		
	}
	
	
	/*This method resets the hand values to their default values.  This is used to reset the game
	 * after the user has played it through.
	 */
	public static void resetHand(Card[] deck) {

	}
	
	
	/*This method is used to get proper input from the user.  It should reject String input and
	 * only accept input in the min-max range specified.  Once it gets acceptable input, it will
	 * return that input
	 */
	public static int errorTrap(int min, int max) {

		
	}
	
	
	/*This method calculates and returns the value of a given hand.  Note that both the dealer hand
	 * and the player hand can be sent to this method.  Kings, Queens and Jacks count as 10 points.
	 * All number cards count as the same value as their number.  Aces count as 11 unless the total 
	 * goes over 21.  If this happens each ace will count as 1 until the total is below 21.  It is
	 * possible to have a total over 21.
	 */
	public static int valueOfHand(Card[] hand) {
		
	}
	
	/*The following two methods were writen to clean up the main program as this block was written
	 * multiple times.
	 */
	public static void showHandsRevealed(Card[] playerHand, Card[] dealerHand) {
		System.out.println("\n\n\n\n");
		System.out.println("Player's Hand:");
		drawHand(playerHand);
		System.out.println("Dealer's Hand:");
		drawHand(dealerHand);
	}
	
	public static void showHandsHidden(Card[] playerHand, Card[] dealerHand) {
		System.out.println("\n\n\n\n");
		System.out.println("Player's Hand:");
		drawHand(playerHand);
		System.out.println("Dealer's Hand:");
		drawHandWithHiddenFirstCard(dealerHand);
	}
	
	public static void main(String[] args) {
		/*
		in order to set Eclipse to work with Unicode
		Project -> Properties -> Resource -> TextFileEncoding -> Set it to UTF-8
		
		Unicode characters you will need:
		System.out.println("\u2660 Spades");
		System.out.println("\u2665 Hearts");
		System.out.println("\u2666 Diamonds");
		System.out.println("\u2663 Clubs");
		System.out.println("\u250f Top Left Card Corner");
		System.out.println("\u2513 Top Right Card Corner");
		System.out.println("\u2501 Horizontal Card Edge");
		System.out.println("\u2503 Vertical Card Edge");
		System.out.println("\u2517 Bottom Left Card Corner");
		System.out.println("\u251b Bottom Right Card Corner");
		*/
		
		int cardsDealt = 0, choice = 0, money = 100, playAgain = 0;
		Card[] deck = new Card[52];
		for(int x = 0; x < 52; x++)
			deck[x] = new Card();
		
		Card[] playerHand = new Card[5];
		for(int x = 0; x < 5; x++)
			playerHand[x] = new Card();
		
		Card[] dealerHand = new Card[5];
		for(int x = 0; x < 5; x++)
			dealerHand[x] = new Card();
		
		do {
			populate(deck);
			shuffle(deck);
			resetHand(playerHand);
			resetHand(dealerHand);
			cardsDealt = 0;
			choice = 0;
			
			//Test Code
			/*
			for(int x = 0; x < 52; x++) {
				System.out.print(deck[x].number + "" + deck[x].suit + " ");
			}
			System.out.println();
			*/
			
			
			dealNextCard(deck, cardsDealt++, playerHand);
			dealNextCard(deck, cardsDealt++, dealerHand);
			dealNextCard(deck, cardsDealt++, playerHand);
			dealNextCard(deck, cardsDealt++, dealerHand);
			
			while(numberOfCardsInHand(playerHand) < 5 && choice != 2 && valueOfHand(playerHand) < 22) {
				
				showHandsHidden(playerHand, dealerHand);
				System.out.println("Cash: $ " + money);
				System.out.println("Player's Hand Value: " + valueOfHand(playerHand));
				
				System.out.println("Player's Turn: ");
				System.out.println("1. Hit");
				System.out.println("2. Stand");
				System.out.print("What would you like to do?");
				choice = errorTrap(1,2);
			
				if(choice == 1)
					dealNextCard(deck, cardsDealt++, playerHand);
			}
			
			if(valueOfHand(playerHand) > 21) {
				showHandsHidden(playerHand, dealerHand);
				System.out.println("Cash: $ " + money);
				System.out.println("Player's Hand Value: " + valueOfHand(playerHand));
				System.out.println("You have busted! You lose.");
				money -= 5;
			}
			else if(numberOfCardsInHand(playerHand) == 5)
			{
				showHandsHidden(playerHand, dealerHand);
				System.out.println("Cash: $ " + money);
				System.out.println("Player's Hand Value: " + valueOfHand(playerHand));
				System.out.println("You Win!");
				money += 5;
			}
			else {
				showHandsRevealed(playerHand, dealerHand);
				System.out.println("Cash: $ " + money);
				System.out.println("Player's Hand Value: " + valueOfHand(playerHand));
				System.out.println("Dealer's Hand Value: " + valueOfHand(dealerHand));
				System.out.println("Dealer's Turn: ");
				while(valueOfHand(dealerHand) < 17)
				{
					System.out.println("Dealer must draw a card...");
					System.out.println("Enter any key to continue...");
					new Scanner(System.in).next();
					dealNextCard(deck, cardsDealt++, dealerHand);
					showHandsRevealed(playerHand, dealerHand);
					System.out.println("Cash: $ " + money);
					System.out.println("Player's Hand Value: " + valueOfHand(playerHand));
					System.out.println("Dealer's Hand Value: " + valueOfHand(dealerHand));
					System.out.println("Dealer's Turn: ");
					
				}
				if(valueOfHand(dealerHand) > 21) {
					System.out.println("The dealer busted! You win!");
					money += 5;
				}
				else{
					System.out.println("Dealer Stands.");
					
					System.out.println("\n");
					if(valueOfHand(dealerHand) > valueOfHand(playerHand)) {
						System.out.println("You lose.");
						money -= 5;
					}
					else if(valueOfHand(dealerHand) < valueOfHand(playerHand)) {
						System.out.println("You win.");
						money += 5;
					}
					else
						System.out.println("It's a push.");
					
				}
				
				
			}
			
			System.out.println("Would you like to play again (1. Yes, 2. No):");
			playAgain = errorTrap(1,2);
		}while(money > 0 && playAgain == 1);
		
		
    }

}
