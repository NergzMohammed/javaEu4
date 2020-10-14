package day3_variables_dataTypes;

public class primitiveVariables {

	private static final char A = 0;

	public static void main(String[] args) {

		
		byte b1 = 23;
	    byte b2 = 100;
	    byte b3 = -120; 
	    
	    System.out.println("b1=" + b1);
	    System.out.println("b2=" + b2);
	    
	    
	    short s1 =2976;
	    short s2 = 3987;
	    short s3= 600;
	    
	    System.out.println("s1 =" + s1);
	    System.out.println("s2 ="+  s2 );
	    System.out.println("s3 =" + s3);
	    
	    
	    int i1 = -1987;
	    int i2 = 154;
	    int i3 = 69;
	    int i4 = -1999;
	    
	    System.out.println("i1 =" + i1);
	    System.out.println("i2 =" + i2);
	    System.out.println("i3 =" + i3);
	    System.out.println("i4 =" + i4);

	    
	    long l1 = 5000;//suffix l here is optional because its in int.range
	    long l2 = 2768290876L; //suffix is mandatory, this number is out of int.range 
	    long creditcardnumber= 87649048372460l; 
	    
	    System.out.println("l1 =" + l1);
	    System.out.println("l2 =" + l2);
	    System.out.println("creditcardnumber =" + creditcardnumber);

	    
	    //float numbers in default is double 
	    		float f1= 2.5f;
	    		double d1 =78.22334;
	    	    System.out.println("f1 =" + f1);
	    	    System.out.println("d1 =" + d1);
	    	    
         char c1= 'A';
         char c2 = 65; //decimal value corresponding to letter 'A'
         char c3 = '\u0041';  //this is unicode corresponding to letter 'A'
         
         System.out.println(c1);
         System.out.println(c2);
         System.out.println(c3);

        		 
            boolean status= true;
            boolean status2= false; 
            
            System.out.println("Eligible to take the exam  "  +   status);
            System.out.println("He is 16, can he take the driver licence?  "  +  status2);
            
            
            String name="Nergz";
            String age= "12";
            System.out.println("name= " + name);



	    		
	    		
	    
	}

}
