import java.util.ArrayList;

import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	ArrayList <Shape> shapes;
	
	ShapeList(){
		shapes = new ArrayList <Shape>();
	}
	
	void insert(Shape s) {
		shapes.add(s);
	}
	
	void draw(SimpleWindow w) {
		for(Shape s : shapes) {
			s.draw(w);
		}
	}
	
	Shape findHit(int xc, int yc) {
		for(Shape s : shapes) {
			if(s.near(xc, yc)) 
				return s;
			
		}
		return null;
	}
	
}
