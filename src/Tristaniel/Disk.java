package Tristaniel;

public class Disk {

	public int size;

	public Disk(int size) {
		this.size = size;
	}

	public String stringOut() {
		String out = " ";

		if (size == 0) {
			out = "   -=-   ";
		}
		else if (size == 1) {
			out = "  -==-   ";
		}
		else if (size == 2) {
			out = "  -===-  ";
		}
		else if (size == 3) {
			out = " -====-  ";
		}
		else if (size == 4) {
			out = " -=====- ";
		}
		else if (size == 5) {
			out = "-======- ";
		}
		else if (size == 6) {
			out = "-=======-";
		}
		else {
			out = "         ";
		}

		return out;
	}
}
