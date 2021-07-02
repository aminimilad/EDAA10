import se.lth.cs.window.SimpleWindow;

public class Turtle {
 
	private double x;
	private double y;
	private double alfa; 
	private boolean boolPD;
	private SimpleWindow Win;
  /** skapar en sköldpadda som ritar i ritfönstret w. 
      Från början befinner sig sköldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt uppåt i fönstret, dvs i negativ y-riktning  
  */
  Turtle(SimpleWindow w, int xHome, int yHome) {
	  this.x = xHome;
	  this.y = yHome;
	  alfa = 90;
	  boolPD = false;
	  this.Win = w;
  }

  /** sänker pennan */
  void penDown() {
	  boolPD = true;
  }

  /** lyfter pennan */
  void penUp() {
	  boolPD = false;
  }

  /** går rakt framåt n pixlar i huvudets riktning */
  void forward(int n) {
	  Win.moveTo((int) Math.round(x), (int) Math.round(y));
	   x = x + n*Math.cos(alfa*(Math.PI/180));
	   y = y - n*Math.sin(alfa*(Math.PI/180));
	  Win.lineTo((int) Math.round(x), (int) Math.round(y));
  }

  /** vrider huvudet beta grader åt vänster */
  void left(int beta) {
	  alfa += beta;
  }

  /** vrider hvudet beta grader åt höger */
  void right(int beta){
	  alfa -= beta;
  }

  /** går till punkten newX,newY utan att rita. 
  Pennans läge huvudets riktning påverkas inte */
  void jumpTo(int newX, int newY) {
	  x = newX;
	  y = newY;
  }

  /** återställer huvudets riktning till den ursprungliga */
  void turnNorth() {
	  alfa = 90;
  }

  /** tar reda på sköldpaddans aktuella x-koordinat */
  int getX() {
	  return Math.round((int) x);
	  
  }

  /** tar reda på sköldpaddans aktuella y-koordinat */
  int getY() {
	  return Math.round((int) y);

  }
}
