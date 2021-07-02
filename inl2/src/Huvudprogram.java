
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
				+ "1: S�tt in en ny person" + "\n"
				+ "2: Tag bort person(er)" + "\n"
				+ "3: S�k telefonnummer fr�n namn/del av namn" + "\n"
				+ "4: S�k namn tillh�rande till ett telefonnummer" + "\n" 
				+ "5: Sortera med avseende p� namn" + "\n"
				+ "6: Sortera med avseende p� telefonnummer" + "\n"
				+ "7: Spara till en fil" + "\n"
				+ "8: L�s in fr�n en fil" + "\n"
				+ "9: Utskrift av registret" + "\n"
				+ "0: Avsluta";
		
		while (true){
			int command = dialog.readInt(menuItems);//�nskat kommando;
			switch (command) {
			
			 case 1: 
				person = new Person(dialog.readString("Skriv in namnet p� personen"), 
						dialog.readString("Skriv in telefonnumret p� personen"));//Fr�ga efter namn & telefonnummer;
				register.insert(person);
				
				break;
			 
			 case 2: 
				register.removeAt(dialog.readString("Skriv in namnet p� personen du vill tabort"));
				break;
			 
			 case 3:
				 sNmn = dialog.readString("Skriv in namnet p� personen du s�ker");
				 
				 if(sNmn != null && !sNmn.isEmpty()) 
				 {
					 dialog.printString(sNmn + " ing�r i f�ljande namn: " + "\r\n" + (register.searchName(sNmn).trim()));
				 }
				 else 
				 {
					 System.out.println("Mata in ett fullst�ndigt namn");
				 }
				 
				 break;
			 
			 case 4:
				 sTfl = dialog.readString("Skriv in telefonnummret p� personen du s�ker");
				 
				 if(sTfl != null && !sTfl.isEmpty()) 
				 {
					 dialog.printString("Telefonnummret " + sTfl + " tillh�r f�ljande person: " + "\r\n" + register.searchNbr(sTfl).trim());
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
				 register.writeToFile(dialog.readString("Skriv in ditt filnamn f�r sparande av kontaktlista"));
				 
				 break;
			 
			 case 8:
				 register.readFromFile(dialog.readString("Skriv in ditt filnamn f�r inl�sning av kontaktlista"));
				 
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
