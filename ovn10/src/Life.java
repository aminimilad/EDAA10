
public class Life {
	private LifeBoard board;
	private int col;
	private int row; 
	private int neighbours;
	private boolean[][]matris;	
	
	Life(LifeBoard board){
		this.board = board;
	}
	public void newGeneration() {
		
		matris = new boolean[board.getRows()][board.getCols()];
		
		board.increaseGeneration();
		for(int a = 0; a<board.getRows(); a++) {
			for(int b = 0; b<board.getCols(); b++) {
				int nr = getNeighbours(board, a, b);
				if(nr == 3 ||nr == 2 && board.get(a, b)) {
					matris[a][b] = true;
				}
				else if(nr >= 4 || nr == 0 || nr == 1) {
					matris[a][b] = false;
				}
			}
			
			//För över matrisen ovan till huvudmatris
			
			
		}
		for(int c = 0; c<board.getRows(); c++) {
			for(int d = 0; d<board.getCols(); d++) {
				board.put(c, d, matris[c][d]);
			}
			
		}
		
	}
	
	public void flip(int row, int col) {
		
		board.put(row, col, !board.get(row, col));
	}
	
	private int getNeighbours(LifeBoard board, int row, int col) {
		neighbours = 0;
		for(int i = row-1; i <= row+1; i++) 
		{
			for(int k = col-1; k <= col+1; k++) 
			{
				
				if(board.get(i, k))
				{
					neighbours++;
				}
			}
		}
			if(board.get(row, col)){
				neighbours--;
			}
			System.out.print(neighbours);
		return neighbours;
	}
}
