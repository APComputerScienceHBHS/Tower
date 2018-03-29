package Tristaniel;

public class towerRenderer {
	
	public static Tower meme;
	public static towerMemory boi;
	
	public static void main(String[] args){
		meme = new Tower(14);
		boi = new towerMemory(meme);
		meme.solveTime(500);
	}
}
