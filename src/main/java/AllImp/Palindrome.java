package AllImp;

public class Palindrome {
	public static void main(String[] args) {
		String actualString="abcba";
		char[] arr=actualString.toCharArray();
		
		String revseString="";
		
		for(int i=arr.length-1;i>=0;i--) {
			revseString=revseString+arr[i];
			
		}
		System.out.println("revseString : "+revseString);
		if(actualString.equals(revseString)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not apalindrome");
		}
	}

}
