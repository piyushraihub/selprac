package AllImp;

public class PrimeNum {
	public static void main(String[] args) {
		
		int n= 2;
		int temp=0;
				boolean flag=true;
		
		for(int i=2;i<n/2;i++) {
			temp=n%i;
			if(temp==0) {
				flag=false;
				break;
			}
			}
		if(flag) {
			System.out.println("Number is  prime");
		}else {
			System.out.println("Number is not prime");
		}
		}

}
