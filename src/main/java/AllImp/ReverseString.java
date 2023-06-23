package AllImp;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
        s = in.nextLine();
		//String s="Automation";
		char[] aa=s.toCharArray();
		String revString = "";
		
		for(int i=aa.length-1;i>=0;i--) {
			 revString=revString+aa[i];
			 System.out.println();	
		}	
		System.out.println("revString  : "+revString);
		
		
		
	}
}
