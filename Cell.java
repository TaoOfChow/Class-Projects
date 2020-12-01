package code;

public class Cell {
	
	private int number; // the solved number in the cell
	private int boxID; // the number of the box the cell is in
	private boolean[] possible = new boolean[10];
		//this indicates what numbers the cell can possibly be
	
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBoxID() {
		return boxID;
	}
	public void setBoxID(int boxID) {
		this.boxID = boxID;
	}
	public boolean[] getPossible() {
		return possible;
	}
	public void setPossible(boolean[] possible) {
		this.possible = possible;
	}
	
	
	

}
