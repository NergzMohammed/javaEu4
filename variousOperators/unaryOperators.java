package variousOperators;

public class unaryOperators {

	public static void main(String[] args) {

		int i1=+10;
		int i2= -100;
		int i3= -(i1+i2);  //-(10-100)
		
		System.out.println("i1= "+i1);
		System.out.println("i2="+i2);
		System.out.println("i3="+i3);

		boolean flag=true;
		System.out.println(!flag);
		
		System.out.println(!!flag);
		
		int i=10, j=5;
		i++;  //same as i+1
		--j; // same as j=j-1
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		//i=11 , j=4
		
		int res=i++ + --j;   //if its post its not becoming active in the same line 
		//when it is pre it is becoming active in the same line 
		System.out.println("res="+res);

		
		
		
		

		
		
		
		

		
		
		
		

		
		
		
		
		
		
		
	}

}
