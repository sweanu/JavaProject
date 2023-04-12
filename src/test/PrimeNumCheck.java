package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		boolean flag =true;
		
		if(num==0 || num==1)
		{
			System.out.println("prime number ");
		
		for(int i=2;i<num/2;i++)
		{
			int rem= num%i;
			
			if(rem==0)
			{
				flag=false;
				break;
			}
		}
		if(flag=true)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
	}
}
