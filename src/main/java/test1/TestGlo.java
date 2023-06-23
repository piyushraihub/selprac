package test1;

public class TestGlo {
	static	int  count=0;
	public static void main(String[] args) {
		int  i=1;	
		print(i);
	}
	
	
	public static void print(int num) {
		
		count=count+num;
		System.out.println(count);
		
		if(count<10) {
			print(count);
		}
	}
	
}
