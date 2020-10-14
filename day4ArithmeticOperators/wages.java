package day4ArithmeticOperators;


//This program calculates wages hourly plus overtime
public class wages {

	public static void main(String[] args) {

		double regularWage;//the calculated regular wage
		
		
		double basePay=25;//the base pay
		double regularHours=40;//the hours worked less overtime
		double overTimeWage;//over Time Wages
		double overTimePay=37.5;
		double overTimeHour=10;
		double totalWage; //Total wage 
		
		regularWage= basePay*regularHours;
		overTimeWage=overTimePay*overTimeHour;
		 
		totalWage=regularWage+overTimeWage;
		
		
		System.out.println("Wages for this week is $"+totalWage);
		
		
		
		
		
		
	}

}
