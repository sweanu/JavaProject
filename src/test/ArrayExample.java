package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array
		int[] array1= {11,28,35,40};
		System.out.println(" length of the array is :"+ array1.length);
		System.out.println(" first number in array is :"+ array1[0]);
		System.out.println(" last number in the array is :"+ array1[array1.length-1]);
		
		//string
		String[] str1= {"mon","tue","wed","thur","fri","sat","sun"};
		System.out.println(" thrid string is :"+str1[2]);
		
		//length of the string with split
		String str2= "hi my name is sweta";
		String[] Split=str2.split(" ");//{"hi","my","name","is","sweta"}
		System.out.println(" number of words in the str2 is :"+ Split.length);
		
	}

}
