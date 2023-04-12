package test;

import java.util.Scanner;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=18;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println(" Enter your age :");
		
		age=scanner.nextInt();
		
		/*if(age>18)
		{
			System.out.println("you are eligible");
		}
		else if(age==18)
		{
			System.out.println("maybe next year");
		}
		else
		{
			System.out.println("you are not eligible");
		}*/
		
		if(age> 30 || age<=18)
		{
			System.out.println("not eligible");
		}
		else if(age==30)
		{
			System.out.println("only this year");
		}
		else
		{
			System.out.println("eligible");
		}
		
		scanner.close();
	}

}
