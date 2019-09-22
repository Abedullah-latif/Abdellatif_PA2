package abdellatif_p3;

import java.util.Arrays;
import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		String[] topics = {"Presidential Candidates", "Climate Chanage", "Open Borders", "Gun Policy", "Renewable Energy"};
		
		int Polling = 1;
		
		int [][] ans = new int [5][10];
		
		while (Polling == 1) {
			
			System.out.println("Rate how important these topics are to you on a scale from 1 to 10.");
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println(topics[i]);
				while(Polling == 1) {
					
					int temp0 = input.nextInt();
					if (temp0 >= 1 && temp0 <= 10) {
						ans[i][temp0-1]++;
						break;
					} else {
						System.out.println("Please enter a whole number between 1 and 10");
					}
				}
				}
			System.out.println("Type No if finished polling. Anything else to Continue");
				
			String cnt = input.next();
				
			if (cnt.equals("No")) {
					
				Polling = 2;
				}
				
	
		}
		
		//Sum category scores
		double [] avg = new double[5];
		double [] total = new double[5];
		int [] sum = new int[5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				total[i] = total[i] + (ans[i][j])*(1+j);
				
			}
		
			for (int j = 0; j < 10; j++) {
				sum[i] = sum[i] + (ans[i][j]);
				
			}
			
			avg[i] = (total[i])/(sum[i]);
				
		}	
		
		
		for (int i = 0; i < 6; i++) {
			
			if(i == 0) {
				System.out.printf("%-20s\t", " ");
				for (int j = 0; j < 10; j++) {
					System.out.printf("%s\t", (j+1));
				}
				System.out.print("Avg \n");
				
			} else {
			
			System.out.printf("%-20s\t", topics[i-1]);
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d\t", ans[i-1][j]);
				
			
			}
			System.out.printf("%.2f\n\n", avg[i-1]);
			
			}
			
		}
		double n = 0;
		double m = total[4];
		String maxs = null;
		String mins = null;
		
		for(int i = 0; i < 5; i++) {
			
			if(total[i] > n) {

				n = total[i];
				maxs = topics[i];
					
			}
			
			if(total[i] < m) {
				
				m = total[i];
				mins = topics[i];				

			}
		}
		
		System.out.printf("The most weighted issue is " + maxs + " with " + (int)n + " total points\n");
		System.out.printf("The most weighted issue is " + mins + " with " + (int)m + " total points\n");
	}
}