package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse string
		String str1="my name is sweta";
		String result="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			result =result + str1.charAt(i);
		}
		System.out.println("reversed string is :"+result);
		
		//palindrome
		
		String str="Maninam";
		String result1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			result1 =result1 + str.charAt(i);
		}
		System.out.println("reversed string is :"+result1);
		
		if(str.equalsIgnoreCase(result1))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not an palindrome");
		}
		
		//reverse the char
		
		String Str2="sweta loves anu and reshu";
		String[] arr2=Str2.split(" ");
		String res="";
		
		for(int i=arr2.length-1;i>=0;i--) {
		res=res+arr2[i]+" ";
		}
		System.out.println("result is : "+res.trim());
	}
}
