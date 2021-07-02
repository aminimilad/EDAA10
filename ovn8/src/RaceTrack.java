import se.lth.cs.window.SimpleWindow;
public class RaceTrack {
	public int startY;
	public int finishY; 
	public SimpleWindow ww;
	
	RaceTrack(int yStart, int yFinish)
	{
		this.startY = yStart;
		this.finishY = yFinish;
	}
	void draw(SimpleWindow w) 
	{
		w.moveTo(100,finishY);
		w.lineTo(400,finishY);
		w.moveTo(100,startY);
		w.lineTo(400,startY);
	}
	

}