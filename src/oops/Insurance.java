package oops;

public class Insurance extends Citizen {

	public int Insuranceid;
	public Insurance()
	{
		System.out.println("default insurance");
	}
	
	public void print() {
		super.print();
		System.out.println("insurance id : "+Insuranceid);
	}
	public void print(int num1)
	{
		System.out.println(num1);
	}
}
