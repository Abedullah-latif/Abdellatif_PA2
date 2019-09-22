package abdellatif_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		// Input for a 4-digit integer
		System.out.println("Please enter a 4 digit pin code");
		int PIN = input.nextInt();
		
		
		// Separate each PIN Character, and take remainder by 10 after adding 7
		int n4 = ((PIN%10)+7) % 10;
		PIN = PIN/10;
		int n3 = ((PIN%10)+7) % 10;
		PIN = PIN/10;
		int n2 = ((PIN%10)+7) % 10;
		PIN = PIN/10;
		int n1 = ((PIN%10)+7) % 10;
		PIN = PIN/10;
		
		// Print out encrypted value after rearranging characters.
		System.out.println("Encrypted value: " + n3 + n4 + n1 + n2);
		
		
		
	}

}