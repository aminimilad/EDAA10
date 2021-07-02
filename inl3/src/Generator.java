import java.awt.Color;

public class Generator {

	int pixelsize;
	int count;
	public Generator() {
		
	}
	public void render(MandelbrotGUI gui) {
		gui.disableInput();
		
		Complex complex [][] = mesh(gui.getMinimumReal(), gui.getMaximumReal(),
									gui.getMinimumImag(), gui.getMaximumImag(), gui.getHeight(), gui.getWidth());
		pixelsize=1;
		switch(gui.getResolution()) {
		case MandelbrotGUI.RESOLUTION_VERY_LOW: 
			pixelsize = 9;
			break;
		case MandelbrotGUI.RESOLUTION_LOW: 
			pixelsize = 7 ;
			break;
		case MandelbrotGUI.RESOLUTION_MEDIUM: 
			pixelsize = 5;
			break;
		case MandelbrotGUI.RESOLUTION_HIGH: 
			pixelsize = 3;
			break;
		case MandelbrotGUI.RESOLUTION_VERY_HIGH:
			pixelsize = 1;
			break;
		
	}
	
		Color [] colorscale = new Color [256];
		for (int i = 0; i < 256; i++) {
			colorscale[i] = new Color(i/150 + 1, i/50, i/3 + 50);

		}
		Color[][] picture = new Color [gui.getHeight()/pixelsize][gui.getWidth()/pixelsize];
		
		
		
		for(int i = 0; i < gui.getHeight()/pixelsize; i++) {
			//int x = pixelsize / 2;
			for(int k = 0; k < gui.getWidth()/pixelsize; k++) {
				count = 1;
				Complex Z = new Complex(0, 0);
				while(count <= 1000) {
					
					Z.mul(Z);
					Z.add(complex[i*pixelsize + pixelsize/2][k*pixelsize + pixelsize/2]);
					count++;
					
				}
				switch(gui.getMode()) {
					case MandelbrotGUI.MODE_COLOR:
						if(Z.getAbs2() <= 4) {
							
							picture[i][k] = Color.RED;
						}
						else {
							picture[i][k] = colorscale[k%50];
							
						}
						break;
					case MandelbrotGUI.MODE_BW:
						if (Z.getAbs2() <= 4) {
							picture[i][k] = Color.BLACK;
						} else {
							picture[i][k] = Color.WHITE;
						}
					}
				
				
			}
		}
		
		gui.putData(picture, pixelsize, pixelsize);
		gui.enableInput();
		
		
	}
	
	private Complex[][] mesh(double minRe, double maxRe, double minIm, double maxIm, int height, int width){
		Complex [][] mesh = new Complex[height][width];
		
		for(int i = 0; i <= height - 1; i++) 
		{
			for(int k = 0; k <= width - 1; k++) 
			{
				double a = minRe + (-minRe + maxRe) / (width - 1) * k;
				double b = maxIm - (-minIm + maxIm) / (height - 1) * i;
				mesh[i][k] = new Complex (a, b);
			}
			
		} 
		
		return mesh;
	}
	
}
