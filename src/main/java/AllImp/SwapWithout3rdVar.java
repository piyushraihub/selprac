package AllImp;

public class SwapWithout3rdVar {

	public static void main(String[] args) {
		int a=15;
		int b=30;
		 a=a+b;//45
		 System.out.println(a);
		b=a-b;
		System.out.println("b ="+b);
		a=a-b;
		System.out.println("a ="+a);
	}
}
