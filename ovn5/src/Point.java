public class Point {

	private static int x;
	private static int y;
	private static Point point = new Point (x, y);
	
	public Point(int x, int y) {
		
	}
	public static Point Move(Point p1)
	{
		int dx = p1.x;
		int dy = p1.y;
		return new Point(dx,dy);
	}
	public double distanceTo(Point p) {
		int deltX = p.x;
		int deltY = p.y;
		return Math.sqrt(deltY * deltY + deltX * deltX); 
	}

}
