package Tristaniel;

public class towerMemory {

	private int disks;
	
	private int[] towState;
	
	public towerMemory(Tower tow) {
		towState = tow.getState();
	}	
}