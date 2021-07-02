
public class Person {
	private String name;
	private String nbr;
	
	/** Skapar en person med namnet name och telefonnumret nbr **/
	
	public Person(String name, String nbr) {
		this.name = name;
		this.nbr = nbr;
	}

	/** Returnerar namnet **/
	public String getName() {
		return name;
	}
	
	/** Returnerar telefonnumret */
	public String getNbr() {
		return nbr;
	}
	/** Returnerar en str�ng som best�r av personens namn och
	 telefonnummer */
	public String toString() {
	return name + "\t" + nbr;
	}
}
