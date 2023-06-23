package AllImp;

public class ArmstrongNum {
//Armstrong number is the number which is the sum of the cubes of all its unit, tens and hundred digits for three-digit numbers.
	public static void main(String[] args)  {  
//		   int c=0,a,temp;  
//		   int n=153;//It is the number to check Armstrong  
//		   temp=n;  
//		   while(n>0)  
//		   {  
//		   a=n%10;  
//		   n=n/10;  
//		    c=c+(a*a*a);  
//		    }  
//		    if(temp==c)  
//		    System.out.println("armstrong number");   
//		    else 
//		        System.out.println("Not armstrong number");  
		
		int n=153;
//		  int c=0,a,temp;  
//		  temp=n;
		
	int	a=0;
	int temp=n;
	int c=0;
	
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		
	}if(temp==c) {
		System.out.println("armstrong number");  
	}
	    else {
	        System.out.println("Not armstrong number");  
	    }
	}
		
		
		
		   }  

