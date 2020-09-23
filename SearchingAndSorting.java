package code;

import java.util.Scanner;

public class SearchingAndSorting {

	public static int[] array = /*{52,  45  ,42,  85 , 97 , 80 , 44 , 89,  53,  6};*/new int[100];
	
	public static void randomPop(){
		for(int x = 0; x< array.length; x++)
			array[x] = (int)(Math.random()*100+1);
	}
	
	public static void display(){
		for(int x = 0; x< array.length; x++){
			if(array[x] == 100)
				System.out.print(array[x] + " ");
			else if(array[x] > 9)
				System.out.print(array[x] + "  ");
			else 
				System.out.print(array[x] + "   ");
			if((x+1)%10 == 0)
				System.out.println();
		}
	}
	
	public static void mergeSort(){
		int[] tempArray = new int[array.length];
		mergeSort(0,array.length-1, tempArray);
	}
	
	public static void mergeSort(int begin, int end, int[] tempArray){
	
		int middle = (begin+end)/2;
		if(end-begin > 1)//this list is too big!
		{
			mergeSort(begin, middle, tempArray);//a
			mergeSort(middle+1, end, tempArray);//b
		}
		//At this point, the list is small enough to sort
		
		int leftMarker = begin;
		int rightMarker = middle+1;
		
		for(int x = begin; x <= end; x++)
		{
			if(rightMarker > end)
				tempArray[x] = array[leftMarker++];
			else if (leftMarker > middle)
				tempArray[x] = array[rightMarker++];
			else if(array[leftMarker] <= array[rightMarker])
				tempArray[x] = array[leftMarker++];
			else 
				tempArray[x] = array[rightMarker++];	
		}
		for(int x = begin; x <= end; x++)
			array[x] = tempArray[x];
		
	}
	
	public static void main(String[] args) {
		
		int choice = 0;
		do{
			System.out.println("\n=======================\n");
			System.out.println("0. Exit");
			System.out.println("1. Populate Sequentially");
			System.out.println("2. Populate Randomly");
			System.out.println("3. Display");
			System.out.println("4. Merge Sort");
			
			choice = new Scanner(System.in).nextInt();
			
			if (choice == 2)
				randomPop();
			else if (choice == 3)
				display();
			else if (choice == 4)
				mergeSort();
		}while (choice != 0);
		
	}
	

}
