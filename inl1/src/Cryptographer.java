import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr11.*;
public class Cryptographer {
	
	public Key x;
	char letter;
	int index;		//index f�r bokst�vernas pos.
	int alfa;		//det slutgiltiga talet som konverterats till int fr�n char. 
	String sContainer; // en beh�llare av nyckeln k i str�ng
	int msr = 0;	//mellanslagsr�knare som hanterar anv�ndningen av 1&2:a alfabetet vid inl�sning av mellanrum
	char newletter;	//Tilldelas den nya bokstaven utifr�n parametrarna alfa & index. 
	StringBuilder SB;

	
	Cryptographer(Key key) {
		x = key;
	}
	
	String encrypt(String text) {
		//Kolla varje bokstav i texten (vilken plats i alfa.
		//Sen kolla 12221, k�ra forsats 
		//kolla vilkekn siffra alfabet ska kolla p�
		//hitta motsvarande bokstav till ursprungliga alfabetet genom position.
		SB = new StringBuilder();
		msr = 0;
		char[] txt = text.toCharArray();
		//testutksrift
		System.out.print(txt.length);
		for(int i=0; i!=txt.length; i++)
		{
			
			 letter = txt[i];
			 index = letter - 'A';
			
		

		

			 sContainer = x.get5DigitNumber() + "";
			 
			 alfa = sContainer.charAt((i-msr)%5) - '0';
			 
			 if(index < 0)
			 {
				 // �ka msr d� ett mellanslag har antr�ffats
				 msr++;
				 //Skriv ut " " i SB som d� kan g�ra en utskrift med mellanslag
				 SB.append(" ");
			 }
			 else 
			 {
				 //H�MTAR en ny bokstav
				 newletter = x.getLetter(index, alfa);
				 //append
				 SB.append(newletter);
			 }
			 //test
			 System.out.print(index + ", " + alfa + ", " + letter + "     ");
			 
		}
		//returnerar det f�rdiga talet 
		return SB.toString();
	}
}
 
