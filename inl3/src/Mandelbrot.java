import java.util.Scanner;
public class Mandelbrot {

	public static void main(String[] args) {
		MandelbrotGUI gui = new MandelbrotGUI();
		Generator g = new Generator();
		boolean ren = false;
		while(true) 
		{
			switch(gui.getCommand()) 
			{
			case MandelbrotGUI.QUIT:
				System.exit(0);
				break;
			
			case MandelbrotGUI.RESET:
				gui.clearPlane();
				gui.resetPlane();
				ren = false;
				break;
				
			case MandelbrotGUI.ZOOM:
				if (!ren) {
					gui.clearPlane();
					gui.resetPlane();
					break;
				}
		
			
			case MandelbrotGUI.RENDER:
				g.render(gui);
				ren = true;
				break;
			}

		}
		
		
	}

}
