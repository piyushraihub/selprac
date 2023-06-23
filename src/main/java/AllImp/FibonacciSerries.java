package AllImp;

public class FibonacciSerries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13
		
		int num=9;
		int a=0;int b=0;int c=1;
		for(int i=0;i<num;i++) {
			a=b;//0//1//1
			b=c;//1//0/1
			c=a+b;//0//1
			System.out.print(a+",");
		}
	}
}
