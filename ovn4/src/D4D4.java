import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;
public class D4D4 {

	public static void main(String[] args) 
	{
		SimpleWindow w = new SimpleWindow(1000, 660, "Fönster");
		Turtle t = new Turtle (w, 250, 250);
		
		t.penDown();
	
			
			while(true) 
			{
				w.waitForMouseClick();
				int x = w.getMouseX(); 
				int y = w.getMouseY();
				t.jumpTo(x,y);
					for(int i = 0; i<40; i++)
					{
						for(int v = 0; v<4; v++)
						{
							t.right(90);
							t.forward(300);
						}
						
						t.jumpTo(t.getX()+5, t.getY()+5);
					}
					
	
			}
		
		
		
	}

}
