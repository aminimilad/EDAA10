import se.lth.cs.window.SimpleWindow;


import se.lth.cs.p.ovn.turtle.Turtle;

public class D2P3 {

	public static void main(String[] args) throws InterruptedException {
		SimpleWindow w = new SimpleWindow(500,500,"Turtelek Window");
		Turtle t = new Turtle (w, 250,250);
		t.penDown();
		for(int i = 0; i <= 17 ; i++)
		{
			t.left(90);
			t.forward(100);
			Thread.sleep(50);
			t.left(120);
			t.forward(100);
			Thread.sleep(50);
			t.left(120);
			t.forward(100);
			Thread.sleep(50);
			t.penUp();
			t.right(120);
			t.forward(40);
			SimpleWindow.delay(50);
			t.penDown();
			t.right(120);
			t.forward(100);
			Thread.sleep(50);
			t.left(120);
			t.forward(100);
			Thread.sleep(50);
			t.left(120);
			t.forward(100);
			Thread.sleep(50);

		}
		
		
		
				
	}

}
