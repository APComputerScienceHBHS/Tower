package Tristaniel;

public class Tower {

	private int disks, pole1, pole2, pole3, step;
	
	public Tower(int disks) {
		this.disks = disks;
	}

	/** Solves tower based on input */
	public void solve() {
		if (isValid(disks) == true){
			moveTower(disks, 1, 3, 2);
		}
		else {
			System.out.println("Tower count invalid! Must be within range 1-7 disks.");
			System.out.println("You gave " + disks + ".");
		}
	}

	/** @return boolean if valid input */
	private boolean isValid(int disks) {
		boolean valid = false;
		if (1 <= disks && disks <= 7) {
			valid = true;
		}
		return valid;
	}

	private void moveTower(int numDisks, int start, int end, int temp) {
		if (numDisks == 1) {
			moveOneDisk(start, end);
		}
		else {
			moveTower(numDisks - 1, start, temp, end);
			moveOneDisk(start, end);
			moveTower(numDisks - 1, temp, end, start);
		}
	}

	private void moveOneDisk(int start, int end) {
		step++;
		System.out.println("Step " + step + ": Move one disk from " + start + " to " + end);
	}
	
	/** @return array equal to the three pegs */
	public int[] getState() {
		int[] state = new int[3];
		state[1] = pole1;
		state[2] = pole2;
		state[3] = pole3;
		return state;
	}
}
