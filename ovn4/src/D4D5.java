import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;
import java.util.Random;
public class D4D5 {

	public static void main(String[] args) 
	{
		SimpleWindow w = new SimpleWindow(1000, 660, "Fönster");
		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 350);
		int stglngd1, beta1, stglngd2, beta2;
		double avs;
		
		t1.penDown();
		t2.penDown();
		
		do{
			
			//1
			double x1 = t1.getX();
			double y1 = t1.getY();
			//2
			double x2 = t2.getX();
			double y2 = t2.getY();
			
			double dX = x2-x1;
			double dY = y2-y1;
			
			avs = Math.sqrt(dX*dX + dY*dY);
			
			Random rand1 = new Random();
			stglngd1 = 1 + rand1.nextInt(10);
			beta1 = -179 + rand1.nextInt(360);
			
			Random rand2 = new Random();
			stglngd2 = 1 + rand2.nextInt(10);
			beta2 = -179 + rand2.nextInt(360);
			
			t1.forward(stglngd1);
			t1.right(beta1);
			w.delay(1);
			
			
			t2.forward(stglngd2);
			t2.left(beta2);
			w.delay(1);


		}
		while(avs >= 50);
	}

}
