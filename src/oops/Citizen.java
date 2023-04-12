package oops;

public class Citizen extends Person{

	public int SSN;
	
	public Citizen()
	{
		System.out.println("default citizen");
	}
	
	public Citizen(String name,String countryname,int age,int SSN)
	{
		System.out.println("parameter citizen");
		this.name=name;
		this.countryname=countryname;
		this.age=age;
		this.SSN=SSN;
	//	System.out.println("name,country,age,ssn : "+name+" " +countryname+" "+age+" "+SSN);
	}
	
	public void print()
	{
		System.out.println("ssn : "+SSN);
	}
	
	/*public static void DisplayCitizen()
	{
//		System.out.println("name,country,age,ssn : "+name+" " +countryname+" "+age+" "+SSN);	
	}*/
}
