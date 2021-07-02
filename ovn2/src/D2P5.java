import java.util.Scanner;
public class D2P5 {

	public static void main(String[] args) {
			
	 
		int nextScan = 0;
		int nextBig = 0;
		int big = 0;
		System.out.print("Skriv in 10 tal:  "); 
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			nextScan = scan.nextInt();
			if(nextScan > big)
			{
				nextBig = big;
				big = nextScan;
				
			}
			else if(nextScan > nextBig)
			{
				nextBig = nextScan;
			}
			
			
		}
		
		System.out.print("Big: " + big);
		System.out.print("nextBig: " + nextBig);

		
	}

}
