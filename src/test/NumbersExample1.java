package test;

public class NumbersExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=12;
		int num2=3;
		
		int result =addition(num1,num2);
		int result1=subtraction(num1,num2 );
		System.out.println("result is :" + result);
		System.out.println("result is :" + result1);
	}
	
	public static int addition(int a, int b)
	{
		return a+b;
	}
	public static int subtraction(int a, int b)
	{
		return a-b;
	}
}
