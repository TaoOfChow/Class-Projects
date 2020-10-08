package code;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		
		InputStreamReader keyboard = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(keyboard);
		int height = Integer.parseInt( input.readLine() );
		int width = Integer.parseInt( input.readLine() );
		/*int smallestDimension = 0;
		
		if(height < width)
			smallestDimension = height;
		else
			smallestDimension = width;
			*/

		//TEST CODE
		//int height = 3;
		//int width = 4;
		
		int[][] grid = new int[height+1][width+1];
		
		//TEST CODE
		
		//grid[0] = new int[] {0,0,0,0,0};
		//grid[1] = new int[] {0,3,10,8,12};
		//grid[2] = new int[] {0,1,11,12,12};
		//grid[3] = new int[] {0,6,2,3,9};

		//POPULATING THE ARRAY*************
		for(int x = 1; x <= height; x++){
			
			String[] array = input.readLine().split(" ");
			
			for(int y = 1; y <= width; y++){
				grid[x][y] = Integer.parseInt(array[y-1]);
	
			}
		}
		
		//POPULATING THE ARRAY*************
		
		//DISPLAY - TEST CODE
		/*
		for(int x = 1; x <= height; x++){
			for(int y = 1; y <= width; y++){
				System.out.print(grid[x][y] + " ");
			}
			System.out.println();
		}
		*/
		int step = 0, count = 1, target = height* width;
		boolean [][] inList = new boolean[height+1][width+1];
		int[] possibleX = new int[target];
		int[] possibleY = new int[target];
		possibleX[0] = 1;
		possibleY[0] = 1;
		inList[1][1] = true;
		int currentValue = 0;
		int factor2 = 0;
		/*
		boolean targetFound = false;
		//Checking to see if the target is even in the list at all
		for(int x = 1; x <= height; x++){
			for(int y = 1; y <= width; y++){
				if(grid[x][y] == target){
					targetFound = true;
					break;
				}
			if(targetFound)
				break;
			}
		}
				
		if(!targetFound)
			System.out.println("no");
		else
		{*/
			do
			{
				currentValue = grid[possibleX[step]][possibleY[step]];
			
				if(currentValue == target){
					System.out.println("yes");
					break;
				}
				
				//Looking for factors
				for(int x = 1; x <= (int)Math.sqrt(currentValue); x++){
					if(currentValue%x == 0){
						factor2 = currentValue / x;
						
						if(x <= height && factor2 <= width && !inList[x][factor2]){
							possibleX[count] = x;
							possibleY[count++] = factor2;
							inList[x][factor2] = true;
						}
						
						if(x <= width && factor2 <= height && !inList[factor2][x]){
							possibleX[count] = factor2;
							possibleY[count++] = x;
							inList[factor2][x] = true;
						}
						
						
					}
				}
				step++;
				
				//System.out.println("Possible list:");
				//for(int a = 0; a < count; a++)
				//System.out.println(possibleX[a] + "," +possibleY[a]);

			}while(step < count);
		
			if(step == count)
				System.out.println("no");
			
			
		//}
			
			
	}
		

}
