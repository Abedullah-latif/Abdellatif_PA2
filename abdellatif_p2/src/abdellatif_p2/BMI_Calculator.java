package abdellatif_p2;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double BMI;
		String measure = "";
		
		
		System.out.println("Thanks for using our BMI Calculator");
		System.out.println("Please specify if you will be using metric or imperial units");
		System.out.println("Enter Metric or Imperial:");
		
		measure = input.nextLine();
		
		if (measure.equals("Metric") || measure.equals("metric")) {
			
			System.out.println("Please enter height (meters)");
			double Ht = input.nextDouble();
			
			System.out.println("Please enter weight (kilograms)");
			double Wt = input.nextDouble();
			
			BMI = Wt/(Math.pow(Ht, 2));
			
			System.out.printf("Your BMI is %.2f %n %n", BMI);
			
			
		} else if (measure.equals("Imperial") || measure.equals("imperial")) {
			
			System.out.println("Please enter height (inches)");
			double Ht = input.nextDouble();
			
			System.out.println("Please enter weight (pounds)");
			double Wt = input.nextDouble();
			
			BMI = (703 * Wt)/(Math.pow(Ht, 2));
			
			System.out.printf("Your BMI is %.2f %n %n", BMI);
			
		} else {
			
			System.out.println("Restart and enter a valid measurement system");
			
		
		}
		
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}

}
