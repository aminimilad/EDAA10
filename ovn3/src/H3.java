import java.util.Scanner;
public class H3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int n = 0; 
		double sum1 = 0;
		double sum2 = 0;
		double s = 0;
		double m = 0;
			
		System.out.println("Mata in flera tal och avsluta med ett tecken: ");
		while(scan.hasNextInt())
		{
			int i = scan.nextInt();
			sum1 = sum1 + i;
			sum2 += i*i;
			n++;
			
		}
		
		 m = sum1/n;
		 System.out.println("Medelvärdet blir: " + m);
		 
		if(!(n<=5))
		{
			s = Math.sqrt(((sum2)-n*m*m)/(n-1));
			System.out.print("Standardavvikelsen blir: " + s);
		}
		else {
			System.out.println("För få tal för standardavvikelse");
		}
		
				
		
		
		
	}

}
