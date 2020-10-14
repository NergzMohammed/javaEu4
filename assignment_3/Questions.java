package assignment_3;

public class Questions {

	public static void main(String[] args) {
    
		
		//Question 1
		 
		int gallon=20;
		double litre;
	     litre=gallon*3.785411784; 
	     
	     System.out.println(gallon + " gallon is " +litre+ " litres. ");
		

		//Question 2
		
        String name= "Nergz"; 
		int dob= 1988 ;
		int age= 2020-dob;
		
		System.out.println("Hello,"+name+"!" + "Based on your input your age is "+ age);
		
		
		
		//question 3
		
		int width=(int) 4.5;
		int height=(int) 7.9;
		
		int area= width*height;
		
		System.out.println(area);
		
		//Question 4
		 
		int num1=100;
		int num2=200;
		System.out.println("num1= "+ num1);
		System.out.println("num2= "+num2);
		
		 
		int temporaryNumber=num1; //100 ,num1=100, num200
		
		num1=num2;
		num2=temporaryNumber;

		System.out.println("num1=" +num2);
		System.out.println( "num2= " +temporaryNumber);
		
		
		
		//Question 5
		
		
		int totalSecond= 3800;
		
		  
		  // hour min sec
		  
		  // 1 hour = 3600 sec
		  // 1 min = 60 sec
		  
		  
		  int hour;
		  int minute ;
		  int second;
		  
		  hour =totalSecond/3600;
		  System.out.println("hour= "+ hour);
		  
		  minute= (totalSecond % 3600)/60;
		 System.out.println("min= "+ minute);
		  
		  
		  second = totalSecond -(hour*3600 + minute*60 );
		  System.out.println("second= "+ second);
		
		System.out.println("Total Second is= "+ totalSecond);
		System.out.println(hour+"hour"+","+ minute+"minute"+","+" and "+ second+" seconds.");
		
		
		//Question 6
		int gram=10;
		int milligram=gram*1000;
		System.out.println(milligram);
		
		
		
		
		
		
		
	}

}
