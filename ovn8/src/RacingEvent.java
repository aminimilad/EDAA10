import java.util.Random;
import java.util.concurrent.TimeUnit;

import se.lth.cs.window.SimpleWindow;
public class RacingEvent {
	
	private RaceTrack trackR;
	private Turtle tr1;
	private Turtle tr2;
	private int y1;
	private int y2;
	private SimpleWindow ww;
	
	RacingEvent(RaceTrack track, Turtle t1, Turtle t2)
	{
		this.trackR = track;
		this.tr1 = t1;
		this.tr2 = t2;
	}
	void REvent(SimpleWindow w) throws InterruptedException
	{
		this.ww = w;
		tr1.jumpTo(200, trackR.startY);
		tr2.jumpTo(300, trackR.startY);
		Random rand = new Random();
		while(tr1.getY() > trackR.finishY && tr2.getY() > trackR.finishY)
		{
			
	
			tr1.forward(rand.nextInt(3));
			ww.delay(10);
			
		

			tr2.forward(rand.nextInt(3));
			ww.delay(10);
		}	
		System.out.println("Antal steg kvar till mållinjen");

		System.out.print("T1: " + (tr1.getY()-100) + " " + "T2: " + (tr2.getY()-100));
		

	}
	

}
