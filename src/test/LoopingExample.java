package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print 1 to 10 using while loop
		int num=1;
		
		while(num<11) {
			
			System.out.println(num);
			num++;
		}
		System.out.println("End of the loop");
		
		//print 10 to 1 using while loop
		int num11=10;
		
		while(num11>0) {
			
			System.out.println(num11);
			num11--;
		}
		System.out.println("end of the loop");
		
		//skip the number 5
		int num1=10;
		
		while(num1>0) {
			
			if(num1==5)
			{
				System.out.println("skip");
				num1--;
				continue;
			}
			System.out.println(num1);
			num1--;
		}
		System.out.println("end of the loop");
		
		
		int num2=10;
		
		while(num2>0) {
			
			if(num2==5)
			{
				System.out.println("stop");
				num2--;
				break;
			}
			System.out.println(num2);
			num2--;
		}
		System.out.println("end of the loop");
		
		
	}

}
