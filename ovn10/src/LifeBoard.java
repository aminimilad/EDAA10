public class LifeBoard {

	private int rows;
	private int cols;
	private int gNbr;
	private boolean[][]matrix;
	
	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	    b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1. */	
	public LifeBoard(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		gNbr = 1;
		matrix = new boolean[rows][cols];
	}
	
	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col �r utanf�r spelplanen returneras false */
	public boolean get(int row, int col) {
		if(row >= rows || col >= cols || col < 0 || row < 0) {
			return false;
		}
		
		return matrix[row][col];
		
	
	}

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		matrix[row][col] = val;
	}
	
	/** Tar reda p� antalet rader */
	public int getRows() {
		return rows;
	}

 	/** Tar reda p� antalet kolonner */
	public int getCols() {
		return cols;
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		return gNbr;
	}

	/** �kar generationsnumret med ett */
	public void increaseGeneration() {
		gNbr++;
	}
}