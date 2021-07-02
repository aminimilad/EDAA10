import se.lth.cs.window.SimpleWindow;

public class Circle extends Shape {
	
	private int r;
	
	Circle(int x, int y, int r) {
		super( x, y);
		this.r = r;
	}
	

	@Override
	public void draw(SimpleWindow w) {
		w.moveTo(x+r, y);
		
		for(int i = 0; i < 90; i++) {
			int a =  (int) (r*Math.cos(i*2*Math.PI/90));
			int b = (int) (r*Math.sin(i*2*Math.PI/90));
			 w.lineTo(x + a , y + b);
		}
	}

}
