import java.util.Scanner;
public class P3D5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		int firstScan = 0;
		int nextSenaste = 10000;
		
		
		do {
			 firstScan = scan.nextInt();
			

				if(firstScan == nextSenaste && nextSenaste != 10000)
				{
					counter++;
				}
				nextSenaste = firstScan;
				if( firstScan == 0 )
				       break;

		}
		while(true);
		System.out.println(counter);
		
		
		
	}
}
