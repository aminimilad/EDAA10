import se.lth.cs.window.SimpleWindow;

public class Square extends Shape {
	private int s;
	Square(int x, int y, int s){
		super(x, y);
		this.s = s;
	}
	
	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x + s, y);
		w.lineTo(x + s, y + s);
		w.lineTo(x, y + s);
		w.lineTo(x, y );
	}

}
