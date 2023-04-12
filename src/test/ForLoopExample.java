package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("end");
		
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
		System.out.println("*****");
		
		for(int i=10;i>0;i-=2)
		{
			System.out.println(i);
		}
		
		System.out.println("***");

		int num=2;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" * "+num+" = "+num*i);
		}
		System.out.println("***");
		
		//for loop
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("elements value is : "+arr[i]);
		}
		System.out.println("***");
		
		// for each loop
		for(int val:arr)
		{
			System.out.println(val);
		}
		System.out.println("***");
		
		//string for loop
		String str="sweta anu";
		for(int i=0;i<=str.length()-1;i++)
		{
			System.out.println("character values :"+ str.charAt(i));
		}
		
		
		
		
	}

}
