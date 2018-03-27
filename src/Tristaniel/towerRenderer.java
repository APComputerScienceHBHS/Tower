package Tristaniel;

public class towerRenderer {
	
	public static Tower meme;
	public static towerMemory boi;
	
	public static void main(String[] args){
		meme = new Tower(10);
		boi = new towerMemory(meme);
		meme.solve();
	}
}
