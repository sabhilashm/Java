package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		div(12, 0);
		System.out.println("thank u");
		

	}
	public static void div(int a,int b)
	{
		int rest=0;
		try {
			 rest=a/b;
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	
		System.out.println("div " + rest);
	}

}
