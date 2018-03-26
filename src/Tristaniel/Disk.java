package Tristaniel;

public class Disk {

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Disk(int size) {
		this.size = size;
	}
	
	public String runner() {
		int run = size;
		return stringOut(run);
	}

	private String stringOut(int size) {
		String out = "     ";

		if (size == 1) {
			out = " -1- ";
		}
		else if (size == 2) {
			out = " -2- ";
		}
		else if (size == 3) {
			out = " -3- ";
		}
		else if (size == 4) {
			out = " -4- ";
		}
		else if (size == 5) {
			out = " -5- ";
		}
		else if (size == 6) {
			out = " -6- ";
		}
		else if (size == 7) {
			out = " -7- ";
		}
		else {
			out = "     ";
		}

		return out;
	}
}
