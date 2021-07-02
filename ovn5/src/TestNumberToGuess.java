import java.util.Scanner;
public class TestNumberToGuess {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Skriv in min-värdet: ");
		int min = scan.nextInt();
		System.out.print("Skriv in max-värdet: ");
		int max = scan.nextInt();
		
		NumberGenerator nbrGen = new NumberGenerator(min, max);
		nbrGen.drawNbr();
		
		
		int nbrTries = 0;
		
		System.out.print("Gissa talet : ");
		int gissatTal = scan.nextInt();

		while(!nbrGen.isEqual(gissatTal)){
			

			if (nbrGen.isBiggerThan(gissatTal)){
				nbrTries++;
				//Är solution större?
				System.out.println("ditt svar är mindre än det hemliga numret. Försök igen!");
			}
			else 
			{
				nbrTries++;
				System.out.println("ditt svar är större än det hemliga numret. Försök igen!");

			}
			gissatTal = scan.nextInt();

		}
		System.out.print("Antal försök: " + nbrTries);
		
	}
}
