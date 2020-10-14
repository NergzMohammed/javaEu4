package day4ArithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {

		
		//Number+number= Addition
		System.out.println(20+200);
		//Number +String= concatenation 
		System.out.println(5+ "Hello");
		//String+Boolean=concatenation 
		System.out.println("Hello "+ true);
		
		//String+String= concatenation
		System.out.println("Hello"+" World");
		
		//boolean+number
		//System.out.println(true+1) system will throw error doesn't accept 
		
		System.out.println(2+0+3+ "Cybertek");//5cybertek(num+string)
		System.out.println("Cybertek"+2+8+5);  //cybertek285(string+num)
		System.out.println(2+0+5+"Cybertek"+2+0+5); //7cybertek+205(num+string7cybertek=string then string+num=7cybertek205)
		System.out.println(2+0+5+"Cybertek"+(2+8+1));//7cybertek+(11) if there is number in brackets first it's done the action then concatenation)
		
		
		
		
	}

}
