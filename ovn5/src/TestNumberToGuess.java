import java.util.Scanner;
public class TestNumberToGuess {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Skriv in min-v�rdet: ");
		int min = scan.nextInt();
		System.out.print("Skriv in max-v�rdet: ");
		int max = scan.nextInt();
		
		NumberGenerator nbrGen = new NumberGenerator(min, max);
		nbrGen.drawNbr();
		
		
		int nbrTries = 0;
		
		System.out.print("Gissa talet : ");
		int gissatTal = scan.nextInt();

		while(!nbrGen.isEqual(gissatTal)){
			

			if (nbrGen.isBiggerThan(gissatTal)){
				nbrTries++;
				//�r solution st�rre?
				System.out.println("ditt svar �r mindre �n det hemliga numret. F�rs�k igen!");
			}
			else 
			{
				nbrTries++;
				System.out.println("ditt svar �r st�rre �n det hemliga numret. F�rs�k igen!");

			}
			gissatTal = scan.nextInt();

		}
		System.out.print("Antal f�rs�k: " + nbrTries);
		
	}
}
