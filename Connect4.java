public class Connect4 {
	
	public static int player1Move(char[][] board) {
		///TODO: Examine the board and return the column where you want to drop your next token
		//The column must be from 0 to 6.
	}
	
	public static int player2Move(char[][] board) {
		///TODO: Examine the board and return the column where you want to drop your next token
		//The column must be from 0 to 6
	}
	
	
	public static void showBoard(char[][] board){
		///TODO: Write a method that will show the board as described in the problem.
		
	}
	
	public static boolean makeMove(char[][] board, char ch, int c)
	{
		///TODO: Complete this method:
		//This method actually adds a checker of colour ch into column c.
		//The checker will be added to the lowest unoccupied row of that column.
		//If the checker has been added, the method returns true.  If the checker 
		//could not be added, then the method returns false.
	}
	
	public static boolean boardFull(char[][] board){
		///TODO: Write a method that will check if there are any unoccupied spaces on 
		// the board.  An unoccupied space is detected by looking for a value of ' '.

	}
	
	public static boolean detectWin(char[][] board){
		
		///TODO: Complete this method:
		//This method will check to see if any colour of checker has made a series of 4 
		//on the board.  This series must be in a line but can be horizontal, vertical or 
		//diagonal.
	}
	
	public static void initializeBoard(char[][] board) {
		///TODO: Write a method that initializes the board so that all elements contain a ' '.
	}
	
	public static void main(String[] args)throws Exception {
		
		char[][] board = new char[6][7];
		/*This instantiates the board as a 6 x 7 array.
		 The x-values are going down the board and the y-values
		 are going across from left to right.
	Y-Values --> |0|1|2|3|4|5|6| 
				 ===============
	x-Values	0| | | | | | | |
	  |			1| | | | | | | |
	  |			2| | | | | | | |
	  v			3| |Y|Y| | |R|R|
				4|R|R|R|R|Y|R|Y|
				5|Y|R|Y|Y|Y|R|Y|
			 	 =============== 
		 */
		
		int spot = 0, redWins = 0, yellowWins = 0;
		
		
		//This FOR loop will run 1000 matches to see which player wins more consistently
		for(int x = 0; x < 1000; x++)
		{
			//System.out.println("Round:" + x);
			initializeBoard(board);
			
			//Randomly determining who goes first:
			int goesFirst = (int)(Math.random()*2+1);
			
			while(!detectWin(board) && !boardFull(board)) {
				
				if(goesFirst == 1)
				{
					do
					{
						//System.out.println("Red to move: ");
						spot = player1Move(board);
					}while(makeMove(board,'R',spot) == false);
					
					if(detectWin(board)){
						//System.out.println("Red Wins!");
						redWins++;
					}
					else
					{
						//showBoard(board);
						do
						{
							//System.out.println("Yellow to move: ");
							spot = player2Move(board);
						}while( makeMove(board,'Y',spot) == false);
						
						if(detectWin(board)) {
							//System.out.println("Yellow Wins!");
							yellowWins++;
						}
							
					}
				}
				else
				{
					do
					{
						//System.out.println("Yellow to move: ");
						spot = player2Move(board);
					}while(makeMove(board,'Y',spot) == false);
					
					if(detectWin(board)){
						//System.out.println("Yellow Wins!");
						yellowWins++;
					}
					else
					{
						//showBoard(board);
						do
						{
							//System.out.println("Yellow to move: ");
							spot = player1Move(board);
						}while( makeMove(board,'R',spot) == false);
						
						if(detectWin(board)) {
							//System.out.println("Red Wins!");
							redWins++;
						}
							
					}
				}
				//Test Code showing the game as it progresses after 
				//both players make each turn.
				//showBoard(board);
				//Thread.sleep(1000);
					
			}
			
			
		}
		System.out.println("After 1000 rounds, the winner is: ");
		if(redWins > yellowWins)
			System.out.println("Player 1!");
		else if(redWins < yellowWins)
			System.out.println("Player 2!");
		else
			System.out.println("A Tie!");
		
		System.out.println("Player1: " + redWins +"\tPlayer2: " + yellowWins);
		
	}

}
