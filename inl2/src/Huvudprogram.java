
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException; 

public class Huvudprogram {

	public static void main(String[] args) {
		Dialog dialog = new Dialog();
		Register register = new Register();
		Person person;
		String sNmn;
		String sTfl;
		String menuItems = "Meny" + "\n"
				+ "1: Sätt in en ny person" + "\n"
				+ "2: Tag bort person(er)" + "\n"
				+ "3: Sök telefonnummer från namn/del av namn" + "\n"
				+ "4: Sök namn tillhörande till ett telefonnummer" + "\n" 
				+ "5: Sortera med avseende på namn" + "\n"
				+ "6: Sortera med avseende på telefonnummer" + "\n"
				+ "7: Spara till en fil" + "\n"
				+ "8: Läs in från en fil" + "\n"
				+ "9: Utskrift av registret" + "\n"
				+ "0: Avsluta";
		
		while (true){
			int command = dialog.readInt(menuItems);//önskat kommando;
			switch (command) {
			
			 case 1: 
				person = new Person(dialog.readString("Skriv in namnet på personen"), 
						dialog.readString("Skriv in telefonnumret på personen"));//Fråga efter namn & telefonnummer;
				register.insert(person);
				
				break;
			 
			 case 2: 
				register.removeAt(dialog.readString("Skriv in namnet på personen du vill tabort"));
				break;
			 
			 case 3:
				 sNmn = dialog.readString("Skriv in namnet på personen du söker");
				 
				 if(sNmn != null && !sNmn.isEmpty()) 
				 {
					 dialog.printString(sNmn + " ingår i följande namn: " + "\r\n" + (register.searchName(sNmn).trim()));
				 }
				 else 
				 {
					 System.out.println("Mata in ett fullständigt namn");
				 }
				 
				 break;
			 
			 case 4:
				 sTfl = dialog.readString("Skriv in telefonnummret på personen du söker");
				 
				 if(sTfl != null && !sTfl.isEmpty()) 
				 {
					 dialog.printString("Telefonnummret " + sTfl + " tillhör följande person: " + "\r\n" + register.searchNbr(sTfl).trim());
				 }
				 else 
				 {
					 System.out.println("Mata in ett telefonnummer");
				 }

				 break;
				 
			 case 5:
				 register.sortName();
				 dialog.printString(register.sendToPrint());
				 
				 break;
				 
			 case 6: 
				 register.sortNbr();
				 dialog.printString(register.sendToPrint());
				 
				 break;
			 
			 case 7: 
				 register.writeToFile(dialog.readString("Skriv in ditt filnamn för sparande av kontaktlista"));
				 
				 break;
			 
			 case 8:
				 register.readFromFile(dialog.readString("Skriv in ditt filnamn för inläsning av kontaktlista"));
				 
				 break;
			 case 9:
				 dialog.printString(register.sendToPrint());
				 break;
			 case 0:
				 System.exit(0);
				 break;
				 }
		}
	}

}
