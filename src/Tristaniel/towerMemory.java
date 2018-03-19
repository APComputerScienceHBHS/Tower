package Tristaniel;

public class towerMemory {

	private int disks;

	private int[] towState;
	
	private Disk a, b, c, d, e, f, g;

	public towerMemory(Tower tow) {
		towState = tow.getState();
	}

	public void run() {
		for (int n = 0; n < towState.length; n++) {
			disks += towState[n];
		}
		print();
	}

	private void print() {
		System.out.println();
	}
}