package day4ArithmeticOperators;

public class tasks {

	public static void main(String[] args) {
     //Task13
		//we want to see 46+90=136 in the console so we need 
		//concatenation + and = inside double quotation 
		int num1=100;
		int num2=90;
		int sum=num1+num2;
		System.out.println(  num1 +num2 + sum );//this not what we want to see
		// because these two + + here are the operators + which means concatenation so they will not be seen 
		// in the print out put
		
		System.out.println(num1+ "+" + num2 + "=" +sum);
		
		//Task14
		 //formula to convert fahrnheiht to celcius 
		// F=9*c/5+32
		
		double celcius=100;
		double fahrenheit= 9*celcius/5+32; 
		System.out.println(celcius+ " celcius is equal to "+ fahrenheit+ " fahrenheit" );
		
	    //Task 15
		
		double mile=85;
		double km =mile*1.609344;
		
		System.out.println(mile+ " mile is equal to "+ km + "km");
		
		//Task 16 
		 
		final double PI=3.14;
		double radius=5.5;
		double perimeter=2*radius*3.14; //here i couldnt find the sign for PI so I used the number PI=3.14
		double area=radius*radius*3.14;
		
		System.out.println("Perimeter of the circle is "+perimeter);
		System.out.println("Area of the Circle is "+ area);
		
		//Task 17 
		
		int number1=10; 
		int number2=15;
		int number3= 25;
		
		int average= number1+number2+number3/3;
		
		System.out.println(average); 
		
		
		
		
		
		
		
		
		
		
		
	}

}
