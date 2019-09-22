package abdellatif_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// Input for a 4-digit integer
		System.out.println("Please enter encrypted PIN Value");
		int PIN = input.nextInt();
		
		
		// Separate each PIN Character, and take remainder by 10 after adding 3 to get original
		// value
		
		int n4 = ((PIN%10)+3) % 10;
		PIN = PIN/10;
		int n3 = ((PIN%10)+3) % 10;
		PIN = PIN/10;
		int n2 = ((PIN%10)+3) % 10;
		PIN = PIN/10;
		int n1 = ((PIN%10)+3) % 10;
		PIN = PIN/10;
		
		// Print out original PIN 
		System.out.println("PIN value: " + n3 + n4 + n1 + n2);
		
		
		
	}

}