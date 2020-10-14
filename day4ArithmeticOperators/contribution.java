package day4ArithmeticOperators;

public class contribution {

	public static void main(String[] args) {
  
		
		//this program calculates the amount of pay that will be 
		//contributed to a retirement plan if 5%,8% or 10% of monthly 
		//pay is withheld
		
		
		//Variables to hold monthly pay and the amount of the contribution
		double monthlyPayment= 6000;
		double contribution; 
		
		//calculate and display 5% contribution
		

		contribution= monthlyPayment*0.5;
		
		System.out.println("5 percent is $" +contribution +" per month.");
		
		
		
		//calculate and dusplay8% contribution
		
		contribution= monthlyPayment*0.8;
		
		System.out.println("8 percent is $" +contribution + "per month.");
		// calculate and display 10% contribution
		
		contribution= monthlyPayment*0.10;
		System.out.println("10 percent is $" + contribution + "per month.");
		
		
		
	}
	

}
