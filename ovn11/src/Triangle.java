import se.lth.cs.window.SimpleWindow;

public class Triangle extends Shape {
	private int s;
	
	Triangle(int x, int y, int s){
		super(x,y);
		this.s = s;
	}
	
	public void draw(SimpleWindow w) {
		w.moveTo(x,y);
		int a = (int) (s*Math.cos(Math.PI/3));
		int b = (int) (s*Math.sin(Math.PI/3));
		w.lineTo(x + s, y);
		w.lineTo(x + a, y - b);
		w.lineTo(x, y);

	}
	
}
