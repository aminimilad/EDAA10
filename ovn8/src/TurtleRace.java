import se.lth.cs.window.SimpleWindow;
public class TurtleRace {

	public static void main(String[] args) throws InterruptedException {
		SimpleWindow w = new SimpleWindow(500, 500, "FENSTER");
		Turtle t1 = new Turtle(w,200,0);
		Turtle t2 = new Turtle(w,300,0);
		RaceTrack rt = new RaceTrack(400, 100);
		RacingEvent re = new RacingEvent(rt,t1,t2);

		t1.penDown();
		t2.penDown();
		
		rt.draw(w);
		re.REvent(w);
		
		
	}

}
