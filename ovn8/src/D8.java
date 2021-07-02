import java.util.Random;
import java.util.Scanner;

public class D8 {

	public static void main(String[] args) {
		int tal = 5;
		Scanner scan = new Scanner(System.in);

		int[] v = new int[7];
		
		v[0] = 2;
		v[1] = -5;
		v[2] = 14;
		v[3] = 21;
		v[4]= -7;
		for(int i = 0; i<v.length; i++)
		{
			System.out.print(v[i] + " ");

		}
		System.out.println();
		/*System.out.print("skriv tal & pos");/*
		System.out.println();

		/*int nbr = scan.nextInt();
		int pos = scan.nextInt();
		
		for(int i = tal; i>pos; i--)
		{
			v[i] = v[i-1];
		}
		
		v[pos] = nbr;
		tal++;
		
		for(int i = 0; i<v.length; i++)
		{
			System.out.print(v[i] + " ");
		}
		*/
		//TABORT/////////////////////////////////////////////////////
		System.out.print("skriv pos");
		int pos = scan.nextInt();
		System.out.println();
		
		if(pos<tal)
		{
			//i+1 för fält 0,1,2..
			for(int i = pos; i+1<=tal; i++)
			{
				v[i] = v[i+1];
				
			}
			tal--;
		}
		for(int i = 0; i<v.length; i++)
		{
			System.out.print(v[i] + " ");
		}
		
		
		
	}

}
