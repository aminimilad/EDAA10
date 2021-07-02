import se.lth.cs.window.SimpleWindow;

public class Turtle {
 
	private double x;
	private double y;
	private double alfa; 
	private boolean boolPD;
	private SimpleWindow Win;
  /** skapar en sk�ldpadda som ritar i ritf�nstret w. 
      Fr�n b�rjan befinner sig sk�ldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt upp�t i f�nstret, dvs i negativ y-riktning  
  */
  Turtle(SimpleWindow w, int xHome, int yHome) {
	  this.x = xHome;
	  this.y = yHome;
	  alfa = 90;
	  boolPD = false;
	  this.Win = w;
  }

  /** s�nker pennan */
  void penDown() {
	  boolPD = true;
  }

  /** lyfter pennan */
  void penUp() {
	  boolPD = false;
  }

  /** g�r rakt fram�t n pixlar i huvudets riktning */
  void forward(int n) {
	  Win.moveTo((int) Math.round(x), (int) Math.round(y));
	   x = x + n*Math.cos(alfa*(Math.PI/180));
	   y = y - n*Math.sin(alfa*(Math.PI/180));
	  Win.lineTo((int) Math.round(x), (int) Math.round(y));
  }

  /** vrider huvudet beta grader �t v�nster */
  void left(int beta) {
	  alfa += beta;
  }

  /** vrider hvudet beta grader �t h�ger */
  void right(int beta){
	  alfa -= beta;
  }

  /** g�r till punkten newX,newY utan att rita. 
  Pennans l�ge huvudets riktning p�verkas inte */
  void jumpTo(int newX, int newY) {
	  x = newX;
	  y = newY;
  }

  /** �terst�ller huvudets riktning till den ursprungliga */
  void turnNorth() {
	  alfa = 90;
  }

  /** tar reda p� sk�ldpaddans aktuella x-koordinat */
  int getX() {
	  return Math.round((int) x);
	  
  }

  /** tar reda p� sk�ldpaddans aktuella y-koordinat */
  int getY() {
	  return Math.round((int) y);

  }
}
