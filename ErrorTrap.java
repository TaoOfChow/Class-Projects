package code;

import java.util.Scanner;

public class ErrorTrap {

	public static void main(String[] args)throws Exception {
		/*The main program must include the instruction to throw exceptions
		 * In JAVA, an error is referred to as an Exception and when one 
		 * occurs, an error report is generated.  Typically we call that e.
		 * We can tell the program to throw only certain types of errors if
		 * we wish but in this case I am saying Exception; which means ALL
		 * EXCEPTIONS.
		 */
		
		
		int data = 0; //this is the input we will get from the user
		Scanner input = new Scanner(System.in);
		
		boolean tryAgain = false; //this will tell us if the data needs to be re-entered
		do
		{
			tryAgain = false;
			/*Because we are in a loop, tryAgain may have been previously
			 * set to be TRUE.  In order to make sure it hasn't, we need 
			 * to explicitly state that it should set back to FALSE.
			 */
			
			System.out.print("Enter a number between 1 and 20:");
			//prompting for input is nice.
			
			//the phrase "try" means that what we are doing might not work.
			try{
				data = input.nextInt(); //taking input
			}
			catch (Exception e)
			/*When the exception is generated, we give the report a name.
			 * In this case, we are calling it "e".  In more advanced programming
			 * you can look at the contents of e to figure out what happened 
			 * and try and make a repair or bypass the error.  In this case we are
			 * just going to tell the computer to empty the data stream and try again.
			 */
			{
				String garbage = input.next();
				//We are using a STRING here because a String can hold any type of data.
				tryAgain = true;
				//We set this variable to TRUE to show that we need the loop to repeat.
			}
			
			/*The second part of this IF statement checks to see if the number is lower
			 * than 1 or greater than 20.  This is outside of the range that we would
			 * accept for this program.  The first part of the IF statement (tryAgain == false)
			 * checks to see if there was actually a number that was previously entered.  If
			 * a non-numeric value was entered, the CATCH statement would have run and set
			 * tryAgain to be true.  Thus, if it is false at this point, the CATCH statement did
			 * not activate - meaning that this is actually a valid number to compare.  If the CATCH 
			 * did activate, then doing the comparison might cause an error.  That is why checking
			 * if tryAgain is true must come first in the IF statement.
			 */
			if(tryAgain == false && (data > 20 || data < 1) )
				tryAgain = true;
			//if the number is too high or too low, we tell the program to tryAgain.
			
		}while(tryAgain == true);//Looping back if needed
		
		System.out.println("The valid data was: " + data);

	}

}
