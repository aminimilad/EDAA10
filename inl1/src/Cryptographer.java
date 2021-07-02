import se.lth.cs.p.inl1.*;
import se.lth.cs.p.inl1.nbr11.*;
public class Cryptographer {
	
	public Key x;
	char letter;
	int index;		//index för bokstävernas pos.
	int alfa;		//det slutgiltiga talet som konverterats till int från char. 
	String sContainer; // en behållare av nyckeln k i sträng
	int msr = 0;	//mellanslagsräknare som hanterar användningen av 1&2:a alfabetet vid inläsning av mellanrum
	char newletter;	//Tilldelas den nya bokstaven utifrån parametrarna alfa & index. 
	StringBuilder SB;

	
	Cryptographer(Key key) {
		x = key;
	}
	
	String encrypt(String text) {
		//Kolla varje bokstav i texten (vilken plats i alfa.
		//Sen kolla 12221, köra forsats 
		//kolla vilkekn siffra alfabet ska kolla på
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
				 // öka msr då ett mellanslag har anträffats
				 msr++;
				 //Skriv ut " " i SB som då kan göra en utskrift med mellanslag
				 SB.append(" ");
			 }
			 else 
			 {
				 //HÄMTAR en ny bokstav
				 newletter = x.getLetter(index, alfa);
				 //append
				 SB.append(newletter);
			 }
			 //test
			 System.out.print(index + ", " + alfa + ", " + letter + "     ");
			 
		}
		//returnerar det färdiga talet 
		return SB.toString();
	}
}
 
