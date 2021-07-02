import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class Register {
	
	private ArrayList<Person> reg; // registret skall lagras i en ArrayList
	int pos;
	StringBuilder SB;
	String strN = " ";
	String strT = " ";
	String container = " ";
	int index;
	Person person;
	
	public Register() {
		reg = new ArrayList<Person>();
	}
	
	public void insert(Person person) {
		reg.add(new Person(person.getName(), person.getNbr()));
		
	}
	
	public void removeAt(String s) {
		for (int i = 0; i < reg.size(); i++) {
			if ((reg.get(i).getName()).toLowerCase().equals(s.toLowerCase())) {
				reg.remove(i);
			}
		}
		
	}
	//Sök om personen finns i registret
	//Om personen finns, returnera telefonnr och namn
	
	public String searchName(String s) {
		
		SB = new StringBuilder();
			for(int i = 0; i < reg.size(); i++) 
			{
				if(reg.get(i).getName().toLowerCase().indexOf(s.toLowerCase()) >=0) 

				{
					SB.append(reg.get(i));
				}
			}
			return SB.toString();
	}
	
	public String searchNbr(String s) {
		
		SB = new StringBuilder();
			for(int i = 0; i < reg.size(); i++) 
			{
				if(s.compareTo(reg.get(i).getNbr()) == 0) {
					SB.append(reg.get(i));

				}
			}
		return SB.toString();
		
	}
	
	public void sortName(){

		int a;
		
		for(int i = 0; i < reg.size(); i++) {
			a = 0;
			for(int k = 0; k < reg.size(); k++) 
			{
				if(reg.get(i).getName().toLowerCase()
						.compareTo(reg.get(k).getName().toLowerCase()) > 0) 
				{
					a++;
				}
			}
			Person temp = reg.get(a);
			reg.set(a, reg.get(i));
			reg.set(i, temp);
		}
		
		
	}
	
	public void sortNbr(){
		int a;
		
		for(int i = 0; i < reg.size(); i++) {
			a = 0;
			for(int k = 0; k < reg.size(); k++) 
			{
				if(reg.get(i).getNbr()
						.compareTo(reg.get(k).getNbr()) < 0)  //TVÄrTOM med pos.
				{
					a++;
				}
			}
			Person temp = reg.get(i);
			reg.set(i, reg.get(a));
			reg.set(a, temp);
		}

	
	}
	
	public String sendToPrint() {
		SB = new StringBuilder();
		for (int i = 0; i < reg.size(); i++) {
		
			SB.append(reg.get(i).getName() + "      " + "\n" + reg.get(i).getNbr() + "\n");
		}
		return SB.toString();
	}

	
	//... Konstruktor och alla metoderna för registerhanteringen
	/** Läser registret från filen med namn fileName. */
	public void readFromFile(String fileName) {

			Scanner scan = null;
			reg.clear();
			try {
			scan = new Scanner(new File(fileName));
			} 
			catch (FileNotFoundException e) 
			{
			System.err.println("Filen kunde inte öppnas");
			System.exit(1);
			}
			while (scan.hasNext()) {
				insert(new Person (scan.nextLine(), scan.nextLine())); // lägga in bok i listan
			}
			scan.close();
		} 
		
		
	
	/** Sparar registret på fil med namnet fileName. */
	public void writeToFile(String fileName) {
		 sortName();
		 PrintWriter out = null;
		 try {
			 out = new PrintWriter(new File(fileName));
		 } 
		 catch (FileNotFoundException e) 
		 {
			 System.err.println("Filen kunde inte öppnas");
			 System.exit(1);
		 }
		 Person prsn;

		 for(int i = 0; i < reg.size(); i++) {
			 prsn = reg.get(i); //plockar ut person på plats i
			 out.println(prsn.getName());
			 out.println(prsn.getNbr());
		 }
		 
		 out.close(); // stänger filen
	}
}
