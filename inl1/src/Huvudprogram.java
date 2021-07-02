import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr11.*;
public class Huvudprogram {


	public static void main(String[] args) {
		TextWindow Window = new TextWindow("Window");
		TextView klarTxt = new TextView("Klartext",10, 80);
		TextView datorTxt = new TextView("Datorns krypterade text",10, 80);
		TextView dinTxt = new TextView("Din krypterade text",10, 80);
		TestCase Case = new TestCase();
		
		Key key = new Key();
		Cryptographer CG = new Cryptographer(key);
		
		//Lägger till, inväntar musen & Klartexten visas genom textCase
		Window.addView(klarTxt);
		Window.addView(datorTxt);
		Window.addView(dinTxt);
		

		for(int i = 0; i<5; i++) {
			Window.waitForMouseClick();
			
			klarTxt.displayText(Case.getClearText(i));
			
			//--"-- & din chiffrerade text visas genom encrypt-metoden i klassen Cryptog.
			//Window.waitForMouseClick();
			dinTxt.displayText(CG.encrypt(Case.getClearText(i)));
			
			//Datorns chiffrerade text visas genom textCase
			//Window.waitForMouseClick();
			datorTxt.displayText(Case.getCryptoText(i));
		}
		
		
	}

}
